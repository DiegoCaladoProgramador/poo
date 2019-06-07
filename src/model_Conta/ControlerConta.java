package model_Conta;

import dados_Conta.iRepConta;

public class ControlerConta extends Controler<ContaAbstrata>{
	private iRepConta<ContaAbstrata> repositorio;
    public void adicionar(ContaAbstrata c){
    	repositorio.adicionar(c);
    }
    public void remover(ContaAbstrata c){   
        repositorio.remover(c);
    }
    public void atualizar(ContaAbstrata c){
    	repositorio.atualizar(c);
    }
    public ContaAbstrata buscar(String c){
    	return repositorio.buscar(c);
    }
    public void creditar(ContaAbstrata c, double valor){
    	c.creditar(valor);
    }
    public void debitar(ContaAbstrata c, double valor) {
    	c.debitar(valor);
    }
    public void transferir(ContaAbstrata c1, ContaAbstrata c2, double valor) {
    	c1.transferir(valor, c2);
    }
    public void renderJuros(ContaAbstrata c) {
    	if(c instanceof Poupança) {
    		((Poupança) c).renderJuros();
    	}
    	else {
    		//erro
    	}
    }
    public void renderBonus(ContaAbstrata c) {
    	if(c instanceof ContaBonificada) {
    		((ContaBonificada) c).renderBonus();
    	}
    	else {
    		//erro
    	}
    }
}