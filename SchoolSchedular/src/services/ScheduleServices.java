package services;

import java.util.ArrayList;
import java.util.List;

import model.Schedule;

public class ScheduleServices {

	
	List<Schedule> schList=new ArrayList<Schedule>();




public List<Schedule> getSchList() {
		return schList;
		
		
	}




	public void setSchList(List<Schedule> schList) {
		this.schList = schList;
		

	}




public void addSchedule(Schedule schedule) {
			
	schList.add(schedule);
	System.out.println(schList);


	}







	
}
