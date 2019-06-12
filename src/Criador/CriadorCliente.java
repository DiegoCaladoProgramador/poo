package Criador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import dados_Cliente.RepositorioClientesArray;
import dados_Cliente.RepositorioTreeSetCliente;
import dados_Cliente.iRepClientes;

public class CriadorCliente {
	private static Properties p;
	static{
		p = new Properties();
		try {
			p.load(new FileInputStream("rep.properties"));
			criador();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static iRepClientes criador (){
		Integer i = Integer.parseInt(p.getProperty("criar.rep.cliente"));
		switch (i){
			case 1:
				return new RepositorioClientesArray();
			case 2:
				return new RepositorioTreeSetCliente();
			default:
				//erro
		}
		return null;
	}
}
