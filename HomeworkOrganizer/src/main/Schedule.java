package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Schedule extends SchedulePanel {


	public Schedule() {

		HashMap<Integer, String> courseList = new HashMap<Integer, String>();
		courseList.put(coursePeriod, courseName);

		System.out.println(courseList);
	}

}
