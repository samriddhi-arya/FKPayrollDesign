package user;

import java.time.LocalDate;

public class TimeCard {

	LocalDate date;
	int hoursPerDay;
	
	public TimeCard(LocalDate date,int hoursPerDay) {
		this.date = date;
		this.hoursPerDay = hoursPerDay;
	}
	
	public void displayTimeCard(String ID) {
		System.out.println("Time Card for Employee " + ID);
		System.out.println("Date: " + date);
		System.out.println("Number of hours worked: " + hoursPerDay);
	}
}
