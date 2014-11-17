package br.unama.entidade;

public class Cliente {

	private Integer codCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String emailCliente;
	private String sexoCliente;
	
	public Cliente() { }
	
	public Cliente(Integer codCliente, String nomeCliente, String cpfCliente,
			String emailCliente, String sexoCliente) {
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.emailCliente = emailCliente;
		this.sexoCliente = sexoCliente;
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
