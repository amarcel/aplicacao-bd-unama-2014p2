package br.unama.teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.unama.entidade.Cliente;

public class ClienteTeste {

	@Test
	public void deveInserirContato() {
		Cliente c = new Cliente();
		c.setNomeCliente("Kelly Key");
		c.setEmail("kkey@gmail.com");
		c.setEndereco("Rua ABC");
		c.setDataNascimento(deveConverterDataNascimento("10/10/1990"));

		ContatoDAO dao = new ContatoDAO();

		try {
			System.out.println("resultado: " + dao.inserirContato(c));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Erro ao tentar inserir Contato");
		}

	}

	private Calendar deveConverterDataNascimento(String dataString) {
		Calendar dataNascimento = null;

		// fazendo a conversão da data
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			return dataNascimento;
		} catch (ParseException e) {
			System.out.println("Erro na conversao de data!");
			return null; // para a execução do método
		}
	}

}
