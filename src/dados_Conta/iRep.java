package dados_Conta;

public interface iRep<E> {
	void adicionar(E a);
	void remover(E a);
    void alterar(E a);
	E buscar(String a);
}