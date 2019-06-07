package dados_Conta;

import model_Conta.ContaAbstrata;

public class RepositorioContaAbstrataArray {
    private ContaAbstrata[] contas;
    private int indice;
    private final static int tamCache = 100;
    public RepositorioContaAbstrataArray(){
        indice = 0;
        contas = new ContaAbstrata[tamCache];
    }
    public void inserir(ContaAbstrata c){
        contas[indice] = c;
        indice++;
    }
    public void remover(ContaAbstrata c){
        if(existe(c.getNumero())){
            int i = this.procurarIndice(c.getNumero());
            contas[i] = contas[indice-1];
            contas[indice-1] = null;
            indice = indice-1;
        }
        else{
            System.out.println("Conta nao encontrada");
        }
    }    
    public void atualizar(ContaAbstrata c){
        int i = procurarIndice(c.getNumero());
        if(i != -1){
            contas[i] = c;
        }
        else{
            System.out.println("Conta nao encontrada");
        }
    }    
    public ContaAbstrata procurar(String num){
        ContaAbstrata c = null;
        if(existe(num)){
            int i = this.procurarIndice(num);
            c = contas[i];
        }
        else{
            System.out.println("Conta nao encontrada");
        }
        return c;
    }    
    private int procurarIndice(String num){
        int i = 0;
        int ind = -1;
        for(ContaAbstrata c : contas){
            if((c.getNumero()).equals(num)){
                ind = i;
                break;
            }
            i++;
        }
        return ind;
    }    
    public boolean existe(String num){
        boolean resp = false;
        int i = this.procurarIndice(num);
        if(i != -1){
            resp = true;
        }
        return resp;
    }   
}
