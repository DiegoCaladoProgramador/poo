package exceptions;

public class ClienteNaoExistenteException extends Exception{
	public ClienteNaoExistenteException() {
		super("Cliente n�o existe!");
	}
}
