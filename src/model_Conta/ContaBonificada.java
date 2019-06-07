package model_Conta;

import model_Cliente.Cliente;

public class ContaBonificada extends ContaCC {
	private double bonus;
	private final double TAXA_BONUS=0.02;
	public ContaBonificada(String numero, double saldo, Cliente cliente) {
		super(numero, saldo,cliente);
	}	
	public void renderBonus(){
		super.creditar(this.bonus);
		bonus = 0;
	}
	public void creditar(double valor){
		bonus = bonus+(valor * TAXA_BONUS);
		super.creditar(valor);
	}
}