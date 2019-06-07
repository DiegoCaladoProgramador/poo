package model_Cliente;

public class Endereco {
	private String cep;
	private String cidade;
	private String bairro;
	private String numero;
	private String rua;
	private String pais;
	private String estado;
	public Endereco(String cep, String cidade, String bairro, String numero, String rua, String pais, String estado) {
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.rua = rua;
		this.pais = pais;
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}