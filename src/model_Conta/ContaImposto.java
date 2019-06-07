package model_Conta;

import model_Cliente.Cliente;

public class ContaImposto extends ContaAbstrata {
	private final double IMPOSTO=0.01;
	public ContaImposto(String numero, double saldo, Cliente cliente) {
		super(numero, saldo,cliente);
	}
	public void debitar(double valor) {
		double imp= IMPOSTO*valor;
		this.setSaldo(this.getSaldo()-(imp + valor));
	}
}