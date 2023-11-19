package lab1;

import java.util.Comparator;

public class AlphaComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getUserName().compareTo(o2.getUserName());
	}
	
}
