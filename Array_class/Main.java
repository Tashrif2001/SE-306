package array_class;

public class Main {

	public static void main(String[] args) {
		UsingArrays u1= new UsingArrays();
		
		u1.printArrays();
		u1.printEquality();
		
		int loc = u1.searchForInt(5);
		if(loc>=0)
			System.out.printf("Found 5 at element %d in intArray\n", loc);
		else
			System.out.println("5 not found\n");
		
		loc = u1.searchForInt(8755);
		if(loc>=0)
			System.out.printf("Found 8755 at element %d in intArray\n", loc);
		else
			System.out.println("8755 not found\n");
	}

}
