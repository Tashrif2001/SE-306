package exception;
import java.util.Scanner;

public class AssertTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 10: ");
		
		int num = sc.nextInt();
		
		assert(num>=0 && num<=10) : "bad number: " + num;
		
		System.out.println("You entered: " + num);
	}
}
