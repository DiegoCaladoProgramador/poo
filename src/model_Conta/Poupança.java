package model_Conta;

import model_Cliente.Cliente;

public class Poupan�a extends ContaCC {
	private final double TAXA = 0.01;
	public Poupan�a(String numero, double saldo, Cliente cliente) {
		super(numero, saldo,cliente);
	}
	public void renderJuros(){
		creditar(this.getSaldo() * TAXA);
	}
}