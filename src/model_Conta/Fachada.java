package model_Conta;
import model_Cliente.ControlerCliente;
import dados_Conta.RepositorioContaAbstrataArray; 
public class Fachada {
	private static Fachada instancia;
	private ControlerConta contas;
	private ControlerCliente cliente;
	public static Fachada obterInstancia(){
		if(instancia == null){
			instancia = new Fachada();
		}
		return instancia;
	}
	private Fachada(){
		initCadastros();
	}
	private void initCadastros(){
		RepositorioContaAbstrataArray rep = new RepositorioContaAbstrataArray();
		contas = new ControlerConta(rep);
	}
}