package br.unama.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.unama.entidade.Cliente;

//TESTE do eclipse

@ManagedBean
@SessionScoped
public class ClienteController {

	private List<Cliente> listaCliente = 
			new ArrayList<Cliente>();
	
	private Cliente cliente;

	public ClienteController() {
		cliente = new Cliente();
	}

	@PostConstruct
	public void carregarListaClientes() {
		listaCliente = cliente.selecionarClientes();
	}
	
	public void inserirCliente(){
		
	}
	public void atualizarCliente(){
		
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}



