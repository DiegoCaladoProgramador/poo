package model_Conta;

import model_Cliente.Cliente;

public abstract class ContaAbstrata {
	private Cliente cliente;
	private String numero;
	private double saldo;
	public ContaAbstrata(String numero,double saldo,Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public ContaAbstrata(String numero,double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public ContaAbstrata(String numero,Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	public ContaAbstrata(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public abstract void debitar(double valor);
	
	public void creditar(double valor){
		saldo = saldo+valor; 
	}
	public void transferir(double valor, ContaAbstrata c2){
		this.debitar(valor);
		c2.creditar(valor);
	}
}