package array_class;
import java.util.*;

public class LinkedListTest {
	List<String>list = new LinkedList<>();
	String[] colors = {"red", "blue", "violet", "black"};
	
	public LinkedListTest() {
		for(String x : colors)
			list.add(x);
		ListIterator<String>it = list.listIterator();
		while(it.hasNext())
		{
			String x = it.next();
			x = x.toUpperCase();
			it.set(x);
		}
		//printList(list);
	    list.add("white");
		while(it.hasNext())
			System.out.print(it.next()+ " ");
	}

	public void printList(List<String> list) {
		for(String x : list)
			System.out.print(x+" ");
		
	}
	public static void main(String[] args) {
		new LinkedListTest();
	}
}
