package model_Cliente;

public class Cliente {
	private String cpf;
	private int idade;
	private String nome;
	private TipoCliente tipo;
	private Endereco endereco;
	public Cliente(String cpf, int idade, String nome, TipoCliente tipo, Endereco endereco) {
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		this.tipo = tipo;
		this.endereco= endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
