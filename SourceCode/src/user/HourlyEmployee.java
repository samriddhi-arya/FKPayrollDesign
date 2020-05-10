package user;

public class HourlyEmployee extends Employee{

	private double hourlyRate;
	private int hoursPerDay;
	
	public double getHourlyRate() { return hourlyRate; }
	
	public String addEmployee(String name, String contactNo, boolean isUnion,double hourlyRate) {
		super.addEmployee(name, contactNo, isUnion);
		this.hourlyRate = hourlyRate;
		
		return getID();
	}
	
}
