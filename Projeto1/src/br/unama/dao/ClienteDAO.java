package br.unama.dao;

import java.sql.Date;
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
			String sql = "insert into cliente (nome) "
					+ " values (?) ";

			PreparedStatement ps = bd.getConexao().prepareStatement(sql);

			ps.setString(1, c.getNomeCliente());
			
			
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

}
