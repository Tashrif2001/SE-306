package thread;
import java.lang.Thread;

public class ThreadCreator {
	public static void main(String[] args) {
		System.out.println("Creating threads: ");
		
		Thread t1 = new Thread(new PrintTask("task 1"));
		Thread t2 = new Thread(new PrintTask("task 2"));
		Thread t3 = new Thread(new PrintTask("task 3"));
		
		System.out.println("Threads created, starting tasks.");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Tasks started, main ends.\n");
	}
}
