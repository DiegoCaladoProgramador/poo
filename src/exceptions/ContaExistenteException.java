package exceptions;

public class ContaExistenteException extends Exception{
	public ContaExistenteException() {
		super("Conta existente!");
	}
}
