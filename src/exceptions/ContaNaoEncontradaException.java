package exceptions;

public class ContaNaoEncontradaException extends Exception{
	public ContaNaoEncontradaException(){
		super("Conta n�o existe!");
	}
}
