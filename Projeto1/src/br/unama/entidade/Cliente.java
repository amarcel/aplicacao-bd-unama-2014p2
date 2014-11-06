package br.unama.entidade;

public class Cliente {

	private Integer codCliente;
	private String nomeCliente;
	
	public Cliente() { }
	
	public Cliente(Integer codCliente, String nomeCliente) {
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
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
	
	
	
}
