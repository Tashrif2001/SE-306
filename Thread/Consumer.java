package all;

import java.util.Random;

public class Consumer implements Runnable{
	private final static Random generator = new Random();
	private final Buffer sharedLocation;
	
	public Consumer(Buffer shared) {
		sharedLocation = shared;
	}
	public void run() {
		int sum=0;
		
		for(int i=1; i<=10; i++)
		{
			try
			{
				Thread.sleep(generator.nextInt(300));
				sum+=sharedLocation.get();
				System.out.printf("\t%2d\n", sum);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Producer done producing\nTerminating producer");
	}
}
