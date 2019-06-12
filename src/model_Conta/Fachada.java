package model_Conta;
import model_Cliente.Cliente;
import model_Cliente.ControlerCliente;
import Criador.CriadorCliente;
import Criador.CriadorConta;
import dados_Cliente.RepositorioClientesArray;
import dados_Cliente.iRepClientes;
import dados_Conta.RepositorioContaAbstrataArray;
import exceptions.MyException;
import exceptions.ParametrosArquivoException; 
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
		ControlerCliente controleCli = new ControlerCliente(CriadorCliente.criador());
		ControlerConta controleCon = new ControlerConta(CriadorConta.criador());
	}
	public void atualizarCliente(Cliente c){
		cliente.atualizar(c);
	}
	public void adicionarCliente (Cliente c){
		cliente.adicionar(c);
	}
	public void removerCliente(Cliente c){
		cliente.remover(c);
	}
	public void atualizarConta(ContaAbstrata c){
		contas.atualizar(c);
	}
	public void adicionarConta(ContaAbstrata c){
		Cliente cli = c.getCliente();
		if(cli != null){
			cliente.buscar(cli.getCpf());
			contas.adicionar(c);
		}else{
			//erro
		}
	}
	public void removerConta(ContaAbstrata c){
		contas.remover(c);
	}
	public void creditar(ContaAbstrata c,double v){
		contas.creditar(c, v);
	}
	public void debitar (ContaAbstrata c,double v){
		contas.debitar(c, v);
	}
	public void transferir(ContaAbstrata origem,ContaAbstrata destino,double val){
		contas.transferir(origem, destino, val);
	}
}
