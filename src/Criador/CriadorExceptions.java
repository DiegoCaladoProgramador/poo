package Criador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import exceptions.MyException;

public class CriadorExceptions {
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
	public static void criador (String erro) throws Exception{
		String i = (p.getProperty(erro));
		Exception e = new MyException(i);
		throw e;
	}
}
