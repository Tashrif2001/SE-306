package labTask;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Phone {
	private Formatter output;
	
	public Phone() {
		try
		{
			output = new Formatter("Book.txt");
			Scanner sc = new Scanner(System.in);
			
			while(sc.hasNext()) {
				output.format("%s %d %d", sc.next(), sc.nextInt(), sc.nextInt());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
