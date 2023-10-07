package all;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time2>{

	@Override
	public int compare(Time2 o1, Time2 o2) {
		int hourCompare = time1.getHour() - time2.getHour();
		if(hourCompare!=0)
			return hourCompare;
		
		int minuteCompare = time1.getMinute()-time2.getMinute();
		
		if(minuteCompare!=0)
			return minuteCompare;
		
		int secondCompare = time1.getSecond()-time2.getSecond();
		return secondCompare;
	}
}
