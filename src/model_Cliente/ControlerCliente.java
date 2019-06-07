package model_Cliente;

import model_Conta.Controler;

import dados_Cliente.iRepClientes;
public class ControlerCliente extends Controler<Cliente> {
	private iRepClientes<Cliente> repositorio;
	public void adicionar(Cliente c){
    	repositorio.adicionar(c);
    }
    public void remover(Cliente c){   
        repositorio.remover(c);
    }
    public void atualizar(Cliente c){
    	repositorio.atualizar(c);
    }
    public Cliente buscar(String c){
    	return repositorio.buscar(c);
    }
}
