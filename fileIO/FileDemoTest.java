package fileIO;

import java.util.Scanner;

public class FileDemoTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		FIleDemo app = new FIleDemo();
		
		System.out.print("Enter file or directory name: ");
		String path = "/home/tashrif/Desktop/BSSE-1448";
		app.analyzePath(input.nextLine());
	}
}	
