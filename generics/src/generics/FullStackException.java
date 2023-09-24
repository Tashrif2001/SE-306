package generics;

public class FullStackException extends RuntimeException{
	public FullStackException() {
		this("The stack is full\n");
	}
	public FullStackException(String message) {
		super(message);
	}
}
