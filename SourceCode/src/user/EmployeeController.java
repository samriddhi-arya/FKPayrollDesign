package user;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeController {

	static Scanner input = new Scanner(System.in);
	
	public static String add() {
		
		System.out.print("Enter Employee Type(salary or hourly): ");
		String type = input.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = input.nextLine();
		System.out.print("Enter Contact Number: ");
		String contact = input.nextLine();
		System.out.print("Is Employee a member of Union(true or false): ");
		boolean isUnion = input.nextBoolean();
		
		if(type.toLowerCase().equals("salary")) {
			System.out.print("Enter Monthly Salary: ");
			double salary = input.nextDouble();
			System.out.print("Enter Commission Rate: ");
			double commission = input.nextDouble();
			SalariedEmployee emp= new SalariedEmployee();
			return emp.addEmployee(name,contact,isUnion,salary,commission);
		}
		else {
			System.out.print("Enter Hourly wages: ");
			double hourlyWage = input.nextDouble();
			HourlyEmployee emp = new HourlyEmployee();
			return emp.addEmployee(name,contact,isUnion,hourlyWage);
		}
	}
	
	public static void delete() {
		System.out.print("Enter Employee ID:");
		String ID = input.nextLine();
		//get from json file with given ID and remove.
		
	}
	
	public static void postTimeCard() {
		System.out.print("Enter Employee ID: ");
		String ID = input.nextLine();
		System.out.println("Enter number of hours worked: ");
		int hours = input.nextInt();
		LocalDate date = LocalDate.now();
		//get the time card for employee from json records.
		TimeCard card = new TimeCard(date,hours);
		card.displayTimeCard(ID);
	}
}
