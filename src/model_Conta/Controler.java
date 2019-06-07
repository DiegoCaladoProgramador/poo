package model_Conta;

public abstract class Controler<E> {
	public Controler() {
	}
	public abstract void adicionar(E e);
	public abstract void remover(E e);
	public abstract void atualizar(E e);
	public abstract E buscar(String e);
}
