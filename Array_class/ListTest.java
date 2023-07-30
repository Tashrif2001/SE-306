package array_class;

import java.util.*;


public class ListTest {
	private static final String[] colors= {"black", "yellow", "green", "blue", "violet", "silver"};
	private static final String[] colors2= {"golden", "white", "brown", "blue", "gray", "silver"};
	
	public ListTest() {
		List<String>list1 = new LinkedList<>();
		List<String>list2 = new LinkedList<>();
		for(String x : colors)
			list1.add(x);
		for(String x: colors2)
			list2.add(x);
		
		list1.addAll(list2);
		list2=null;
		printList(list1);
		
		convertToUpperCase(list1);
		printList(list1);
		System.out.println("\nDeleting elements 4 to 6: ");
		removeItems(list1, 4, 6);
		printList(list1);
		printReversedList(list1);
	}
	public void printList(List<String>list) {
		for(String x : list)
			System.out.printf("%s ", x);
		System.out.println();
	}
	public void convertToUpperCase(List<String>list) {
		ListIterator<String>it = list.listIterator();
		while(it.hasNext()) {
			String x = it.next();
			it.set(x.toUpperCase());
		}
	}
	public void removeItems(List<String>list, int start, int end) {
		list.subList(start, end).clear();
	}
	public void printReversedList(List<String>list) {
		ListIterator<String>it = list.listIterator(list.size());
		System.out.println("\nReversedList: ");
		while(it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}
	}
	public static void main(String[] args) {
		new ListTest();
	}
}
