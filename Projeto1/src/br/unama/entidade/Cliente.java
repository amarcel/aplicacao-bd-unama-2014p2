package br.unama.entidade;

import java.util.ArrayList;
import java.util.List;

import br.unama.dao.ClienteDAO;

public class Cliente {

	private Integer codCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String emailCliente;
	private String sexoCliente;
	
	private ClienteDAO dao;
	
	public Cliente() {
		
		dao = new ClienteDAO();
		
	}
	
	public Cliente(Integer codCliente, String nomeCliente, String cpfCliente,
			String emailCliente, String sexoCliente) {
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.emailCliente = emailCliente;
		this.sexoCliente = sexoCliente;
	}
	
	public List<Cliente> selecionarClientes() {
		try {
			List<Cliente> listaCliente = 
					new ArrayList<Cliente>();
			
			listaCliente = dao.selecionarClientes();
			
			return listaCliente;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}



	public Integer getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	



	
	
	
	
}
