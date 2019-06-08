package dados_Conta;

import model_Conta.ContaAbstrata;
import java.util.HashMap;
import java.util.Map;

public class RepositorioHashMapContas implements iRepConta<ContaAbstrata>{
	private Map<String,ContaAbstrata> map;
	public RepositorioHashMapContas() {
        map = new HashMap<String, ContaAbstrata>();
    }
	@Override
	public void adicionar(ContaAbstrata c) {
		if (map.containsKey(c.getNumero())) {
            map.put(c.getNumero(), c);
        } else {
            //erro
        }
	}
	@Override
	public void remover(ContaAbstrata c) {
		if (map.containsKey(c.getNumero())) {
            map.remove(c.getNumero());
        } else {
            //erro
        }	
	}
	@Override
	public void atualizar(ContaAbstrata c) {
		if (map.containsKey(c.getNumero())) {
            remover(c);
            adicionar(c);
        } else {
            //erro
        }
	}
	@Override
	public ContaAbstrata buscar(String c) {
		ContaAbstrata conta = null;
        conta = (ContaAbstrata) map.get(c);
        if(conta == null){
            //erro
        }
        return conta;
	}
}
