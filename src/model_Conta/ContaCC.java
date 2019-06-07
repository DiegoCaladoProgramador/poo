package model_Conta;

import model_Cliente.Cliente;

public class ContaCC extends ContaAbstrata {
	public ContaCC(String numero, double saldo, Cliente cliente) {
		super(numero,saldo,cliente);
	}
	public void debitar(double valor) {
		this.setSaldo(this.getSaldo()-valor);
	}
}