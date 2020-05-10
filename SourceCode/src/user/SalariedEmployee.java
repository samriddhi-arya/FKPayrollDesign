package user;

import java.util.ArrayList;

public class SalariedEmployee extends Employee {

	private double monthlySalary;
	private double commisionRate;
	SalesCard sales;
	private double weeklyCommision;
	
	public double getMonthlySalary() { return monthlySalary; }
	
	public double getCommisionRate() { return commisionRate; }
	
	public String addEmployee(String name,String contactNo,boolean isUnion,double monthlySalary,double commisionRate) {
		super.addEmployee(name, contactNo, isUnion);
		this.monthlySalary = monthlySalary;
		this.commisionRate = commisionRate;
		
		return getID();
	}
}
