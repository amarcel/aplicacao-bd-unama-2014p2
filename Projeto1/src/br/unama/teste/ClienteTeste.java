package br.unama.teste;

import java.sql.SQLException;

import org.junit.Test;

import br.unama.dao.ClienteDAO;
import br.unama.entidade.Cliente;

public class ClienteTeste {

	@Test
	public void deveInserirContato() {
		Cliente c = new Cliente();
		c.setNomeCliente("Kelly Key");
		c.setEmailCliente("kkey@gmail.com");
		c.setCpfCliente("09189013491");
		c.setSexoCliente("F");

		ClienteDAO dao = new ClienteDAO();

		try {
			System.out.println("resultado: " + dao.inserirContato(c));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Erro ao tentar inserir Contato");
		}

	}

}
