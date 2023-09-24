package generics;
import java.util.ArrayList;

public class TestArray {
	public static void main(String[] args) {
		Number[] numbers = {1, 2.4, 3, 5.3};
		ArrayList<Number>list = new ArrayList<Number>();
		
		for(Number element : numbers)
			list.add(element);
		
		System.out.printf("Sum of elements of %s: \n", list);
		System.out.println(sum(list));
		
	}
	public static double sum(ArrayList<Number>arr) {
		double sum=0;
		
		for(Number elements : arr)
			sum+=elements.doubleValue();
		return sum;
	}
}
