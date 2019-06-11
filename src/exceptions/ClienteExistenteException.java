package exceptions;

public class ClienteExistenteException extends Exception{
	public ClienteExistenteException() {
		super("Cliente Existente!");
	}
}
