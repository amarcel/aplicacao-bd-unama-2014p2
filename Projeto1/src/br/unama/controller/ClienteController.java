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

	public ClienteController() {
	}

	@PostConstruct
	public void carregarListaClientes() {
		for (int i = 1; i <= 10; i++) {
			Cliente c = new Cliente(i, "Cliente #" + i);
			listaCliente.add(c);
		}
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
}



