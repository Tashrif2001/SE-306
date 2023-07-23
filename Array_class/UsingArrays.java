package array_class;
import java.util.*;

public class UsingArrays {
	private int intArray[] = {1,2,3,4,5,6};
	private double doubleArray[] = {8.4,9.3, 0.2,7.9, 3.4};
	private int filledIntArray[], intArrayCopy[];
	
	public UsingArrays(){
		filledIntArray = new int[10];
		intArrayCopy = new int[intArray.length];
		
		Arrays.fill(filledIntArray, 7);
		Arrays.sort(doubleArray);
		
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
	}

	public double[] getDoubleArray() {
		return doubleArray;
	}

	public int[] getFilledIntArray() {
		return filledIntArray;
	}

	public int[] getIntArrayCopy() {
		return intArrayCopy;
	}
	
	public void printArrays()
	{
		System.out.println("double array: ");
		for(double doubleValue : doubleArray)
			System.out.printf("%.1f", doubleValue);
		
		System.out.println("\nint array: ");
		for(int intValue : intArray)
			System.out.printf("%d", intValue);
		
		System.out.println("\nfilled Array: ");
		for(int intValue : filledIntArray)
			System.out.printf("%d", intValue);
		
		System.out.println("\nint Array Copy: ");
		for(int intValue : intArrayCopy)
			System.out.printf("%d", intValue);
		
		System.out.println();
	}
	
	public int searchForInt(int value) {
		return Arrays.binarySearch(intArray, value);
	}
	public void printEquality()
	{
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("intArray %s intArrayCopy\n", (b?"==":"!="));
		
		b=Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s intArrayCopy\n", (b?"==":"!="));
	}
}
