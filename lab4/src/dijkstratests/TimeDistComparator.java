package dijkstratests;

import java.util.Comparator;

public class TimeDistComparator implements Comparator<TimeAndDistance> {

	@Override
	public int compare(TimeAndDistance o1, TimeAndDistance o2) {
		if (o1.time == o2.time) {
			return o1.distance - o2.distance;
		} else {
			return o1.time - o2.time;
		}
	}

}
