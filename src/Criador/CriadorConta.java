package Criador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import dados_Conta.RepositorioContaAbstrataArray;
import dados_Conta.RepositorioHashMapContas;
import dados_Conta.iRepConta;

public class CriadorConta {
	private static Properties p;
	static{
		p = new Properties();
		try {
			p.load(new FileInputStream("rep.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static iRepConta criador (){
		Integer i = Integer.parseInt(p.getProperty("criar.rep.conta"));
		switch (i){
			case 1:
				return new RepositorioContaAbstrataArray();
			case 2:
				return new RepositorioHashMapContas();
			default:
				//erro
		}
		return null;
	}
}
