package model_Conta;
import model_Cliente.Cliente;
import model_Cliente.ControlerCliente;
import dados_Cliente.RepositorioClientesArray;
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
		RepositorioClientesArray repClientes = new RepositorioClientesArray();
		cliente = new ControlerClientes(repClientes);
	}
	public void atualizar(Cliente c){
		cliente.atualizar(c);
	}
	public void adicionar (Cliente c){
		cliente.adicionar(c);
	}
	public void remover(Cliente c){
		cliente.remover(c);
	}
	public void atualizar(ContaAbstrata c){
		contas.atualizar(c);
	}
	public void adicionar(ContaAbstrata c){
		
	}
}
