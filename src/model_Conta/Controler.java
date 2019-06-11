package model_Conta;

import dados_Conta.iRep;

public abstract class Controler<E> {
	private iRep<E> repositorio;
	public Controler() {
	}
	public void adicionar(E e){
		repositorio.adicionar(e);
	}
	public void remover(E e){
		repositorio.remover(e);
	}
	public void atualizar(E e){
		repositorio.atualizar(e);
	}
	public E buscar(String e){
		return repositorio.buscar(e);
	}
}
