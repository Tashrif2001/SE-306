package labTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		FIledemo app = new FIledemo();
		
		System.out.print("Enter file or directory name: ");
		String path = "/home/tashrif/Desktop/BSSE-1448/test.py";
		app.analyzePath(path);
	}
}	