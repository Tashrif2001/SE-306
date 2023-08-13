package exception;
import java.util.*;

public class DivideByZero {
	public static int quotient(int numerator, int denominator)throws ArithmeticException
	{
		return numerator/denominator;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continueLoop=true;
		
		do {
			try
			{
				System.out.println("Please enter an integer numerator: ");
				int numerator = sc.nextInt();
				System.out.println("Please enter an integer denominaor: ");
				int denominator = sc.nextInt();
		
				int res = quotient(numerator, denominator);
				System.out.printf("\nresult: %d/%d = %d\n", numerator, denominator, res);
				continueLoop=false;
			}
			catch(InputMismatchException ie)
			{
				System.err.printf("\nException: %s\n", ie);
				System.out.println("Please try again\n");
				sc.nextLine();
			}
			catch(ArithmeticException ar)
			{
				System.err.printf("\nException: %s\n", ar);
				System.out.println("Please try again\n");
			}
			finally
			{
				System.out.printf("\nThis is finally block\n");
			}
		}
		while(continueLoop);
	}
}
