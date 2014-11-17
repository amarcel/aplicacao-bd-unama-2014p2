package br.unama.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unama.entidade.Cliente;
import br.unama.util.BancoDadosConfig;

public class ClienteDAO {

	private BancoDadosConfig bd;

	public ClienteDAO() {
		try {
			bd = new BancoDadosConfig();
			bd.conectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int inserirContato(Cliente c) throws SQLException {

		try {
			String sql = "insert into cliente (nome, cpf, email, sexo) "
					+ " values (?, ?, ?, ?) ";

			PreparedStatement ps = bd.getConexao().prepareStatement(sql);

			ps.setString(1, c.getNomeCliente());
			ps.setString(2, c.getCpfCliente());
			ps.setString(3, c.getEmailCliente());
			ps.setString(4, c.getSexoCliente());
			
			
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	public List<Cliente> selecionarClientes() {
		
		try {
			List<Cliente> listaCliente = 
					new ArrayList<Cliente>();
			String sql = "select * from cliente";
			PreparedStatement ps = 
					bd.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Cliente c = new Cliente(rs.getInt("cliente_id"), 
						rs.getString("nome"),
						rs.getString("cpf"),
						rs.getString("email"),
						rs.getString("sexo"));
				
				listaCliente.add(c);
				
			}//fim do while
			
			return listaCliente;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
