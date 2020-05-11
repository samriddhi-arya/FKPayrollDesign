package user;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

	private double hourlyRate;
	private int hoursPerDay;
	private TimeCard card;
	
	public double getHourlyRate() { return hourlyRate; }
	
	public TimeCard getTimeCard() { return card; }
	
	public String addEmployee(String name, String contactNo, boolean isUnion,double hourlyRate) {
		super.addEmployee(name, contactNo, isUnion);
		this.hourlyRate = hourlyRate;
		this.card = new TimeCard(LocalDate.now(),0);
		
		return getID();
	}
	
}
