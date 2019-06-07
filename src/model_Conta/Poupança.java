package model_Conta;

import model_Cliente.Cliente;

public class Poupança extends ContaCC {
	private final double TAXA = 0.01;
	public Poupança(String numero, double saldo, Cliente cliente) {
		super(numero, saldo,cliente);
	}
	public void renderJuros(){
		creditar(this.getSaldo() * TAXA);
	}
}