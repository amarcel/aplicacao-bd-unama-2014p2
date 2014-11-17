package br.unama.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
