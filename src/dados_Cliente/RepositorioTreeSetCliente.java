package dados_Cliente;

import java.util.TreeSet;

import model_Cliente.Cliente;

public class RepositorioTreeSetCliente {
	private TreeSet<Cliente> ts;
	
	public RepositorioTreeSetCliente(){ 
        
    } 	
	public void adicionar(Cliente a) { 
        ts.add(a); 
    } 	
	public void remover(Cliente a){ 
        if(ts.contains(a)){ 
        	ts.remove(a); 
        } 
        else{ 
            //error 
        } 
	}	
	public void atualizar(Cliente a){ 
        Cliente cl = procurarCliente(a.getCpf()); 
        if(cl != null) { 
        	remover(cl);
        	adicionar(a);
        }
        else{ 
            //error; 
        } 
    }	
	public Cliente buscar(String a){ 
        Cliente cl = null; 
        if(procurarCliente(a)!= null) { 
            cl = procurarCliente(a); 
        }
        else{ 
            //error; 
        } 
        return cl; 
    }	
	private Cliente procurarCliente(String num) { 
        for(Cliente a: ts) { 
            if(a.getCpf().equals(num)) { 
                return a; 
            } 
        } 
        return null; 
    } 
}
