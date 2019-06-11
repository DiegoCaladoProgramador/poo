package model_Cliente;

import model_Conta.Controler;

import dados_Cliente.iRepClientes;
public class ControlerCliente extends Controler<Cliente> {
	private iRepClientes<Cliente> repositorio;
	public ControlerCliente (iRepClientes rep){
		super(rep);
		this.repositorio = rep;
	}
}
