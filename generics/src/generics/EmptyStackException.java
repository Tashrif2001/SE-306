package generics;

public class EmptyStackException extends RuntimeException{
	public EmptyStackException() {
		this("Stack is empty\n");
	}
	public EmptyStackException(String message) {
		super(message);
	}
}
