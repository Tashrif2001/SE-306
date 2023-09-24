package generics;

public class Stack <E> {
	private final int size;
	private int top;
	private E[] elements;
	
	public Stack() {
		this(10);
	}
	
	public Stack(int size) {
		this.size = size>0?size:10;
		top=-1;
		elements = (E[]) new Object[size];
	}
	
	public void push(E val) {
		if(top==size-1)
			throw new FullStackException(String.format("Stack full, cannot push %s\n", val));
		elements[++top] = val;
	}
	
	public E pop() {
		if(top==-1)
			throw new EmptyStackException("Stack is empty");
		return elements[top--];
	}
}
