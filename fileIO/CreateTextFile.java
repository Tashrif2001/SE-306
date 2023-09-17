package fileIO;

import java.io.*;
import java.util.*;
import java.lang.SecurityException;

public class CreateTextFile {
	private Formatter output;

	public void openFile() {
		try {
			output = new Formatter("clients.txt");
		} catch (SecurityException sec) {
			System.err.println("You do not have write access.");
			System.exit(1);
		} catch (FileNotFoundException filesnot) {
			System.err.println("Error creating file.");
			System.exit(1);
		}
	}

	public void addRecords() {
		AccountRecord rec = new AccountRecord();

		Scanner sc = new Scanner(System.in);

		System.out.printf("%s\n%s\n%s\n%s\n\n", "To terminate input, type the end-of-file indicator ",
				"when you are prompted to enter input.", "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter");

		System.out.printf("%s\n%s", "Enter account number (> 0), first name, last name and balance.", "? ");
		
		while(sc.hasNext()) {
			try
			{
				rec.setAccount(sc.nextInt());
				rec.setFirstName(sc.next());
				rec.setLastName(sc.next());
				rec.setBalance(sc.nextDouble());
				
				if(rec.getAccount()>0)
				{
					output.format("%d %s %s %.2f\n", rec.getAccount(),rec.getFirstName(), rec.getLastName(), rec.getBalance());
				}
				else
					System.out.println("Account number must be greater than 0.");
			}
			catch(FormatterClosedException formatEx)
			{
				System.err.println("Error writing file.");
				return;
			}
			catch(NoSuchElementException elementEx)
			{
				System.err.println("Invalid input. Try again");
				sc.nextLine();
			}
			System.out.printf("%s %s\n%s", "Enter acc num(>0),", "first name, last name and balance.", "? ");
			
		}
	}
	public void closeFile()
	{
		if(output!=null)
			output.close();
	}
}
