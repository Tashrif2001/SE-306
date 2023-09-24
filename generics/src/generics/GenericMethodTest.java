package generics;

public class GenericMethodTest {
	public static <E> void printArray(E[] elements) {
		for(E element : elements)
			System.out.printf("%s ", element);
		System.out.println();
	}
	//works for Object type too
	
	public static void main(String[] args) {
		Integer[] arr1 = {2,4,5,4,1};
		Double[] arr2 = {2.4, 5.4, 6.7, 3.2, 4.6};
		Character[] arr3 = {'a', 'b', 'c', 'd', 'e'};
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}
}
