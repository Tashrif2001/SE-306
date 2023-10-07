package all;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Sort3 {
	public void printElements()
	{
		List<Time2>list = new ArrayList<Time2>();
		
		list.add(new Time2(6,24,34));
		list.add(new Time2(18,14,58));
		list.add(new Time2(6,05,34));
		list.add(new Time2(12,14,58));
		list.add(new Time2(6,24,22));
		
		System.out.printf("Unsorted array \n%s\n", list);
		Collections.sort(list, new TimeComparator());
		
		System.out.printf("Sorted \n%s\n", list);
		
	}
	public static void main(String[] args) {
		Sort3 s = new Sort3();
		s.printElements();
	}
}
