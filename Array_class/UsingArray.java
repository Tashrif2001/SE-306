package array_class;
import java.util.*;

public class UsingArray {
	
	public UsingArray() {
		String[] colors = {"red", "blue", "violet", "pink"};
		LinkedList<String>list = new LinkedList<>(Arrays.asList(colors));
		list.addLast("white");
		list.add("black");
		list.addFirst("gold");
		
		System.out.println("Printing List: ");
		for(String x : list)
			System.out.print(x +" ");
		System.out.println();
		
		colors = list.toArray(new String[list.size()]);
		System.out.println("Printing Array: ");
		System.out.println(Arrays.toString(colors));
	}
	public static void main(String[] args) {
		new UsingArray();
	}
}
