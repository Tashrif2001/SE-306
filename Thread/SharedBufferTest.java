package all;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {
	public static void main(String[] args) {
		ExecutorService app = new Executors.newCachedThreadPool();
		
		Buffer sharedLoc = new UnsynchronizedBuffer();
		
		System.out.println("Action\t\tvalue\tSum of Produced\tSum of Consumed");
		
		System.out.println("-----\t\t-----\t----------\t----------\n");
		
		app.execute(new Producer(sharedLoc));
		app.execute(new Consumer(sharedLoc));
	}
}
