package model;

public class Schedule {
	
	
	
	private String courseName;
	private int startTime;
	private int stopTime;
	private int day;
	
	public Schedule(){
		
			
	}
	
	
public Schedule(String courseName,int startTime,int stopTime,int day) 

{
		
		this.courseName=courseName;
		this.day=day;
		this.startTime=startTime;
		this.stopTime=stopTime;
		
		
	}


public String getCourseName() {
	return courseName;
}


public int getStartTime() {
	return startTime;
}


public int getStopTime() {
	return stopTime;
}


public int getDay() {
	return day;
}


public void setCourseName(String courseName) {
	this.courseName = courseName;
}


public void setStartTime(int startTime) {
	this.startTime = startTime;
}


public void setStopTime(int stopTime) {
	this.stopTime = stopTime;
}


public void setDay(int day) {
	this.day = day;
}


@Override
public String toString() {
	return "Schedule [courseName=" + courseName + ", startTime=" + startTime + ", stopTime=" + stopTime + ", day=" + day
			+ "]";
}
	

	
	


	
	
}