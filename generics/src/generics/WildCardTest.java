package generics;
import java.util.ArrayList;

public class WildCardTest {
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {2.3,4.5,5.6,4.6,7.8};
		Number[] arr3 = {2, 3.4, 5, 5.6, 4};
		
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		ArrayList<Double>list2 = new ArrayList<Double>();
		ArrayList<Number>list3 = new ArrayList<Number>();
		
		for(Integer element : arr1)
			list1.add(element);
		
		for(Double element : arr2)
			list2.add(element);
		
		for(Number element : arr3)
			list3.add(element);
		
		System.out.println("sum of Int: "+sum(list1));
		System.out.println("sum of Double: "+sum(list2));
		System.out.println("sum of Number: "+sum(list3));
		
	}
	public static double sum(ArrayList<? extends Number>arr) {
		double sum=0;
		
		for(Number element : arr)
			sum+=element.doubleValue();
		return sum;
	}
	
}
