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
			String id = emp.addEmployee(name,contact,isUnion,salary,commission);
			JSONController.add(emp);
			return id;
		}
		else {
			System.out.print("Enter Hourly wages: ");
			double hourlyWage = input.nextDouble();
			HourlyEmployee emp = new HourlyEmployee();
			String id = emp.addEmployee(name,contact,isUnion,hourlyWage);
			JSONController.add(emp);
			return id;
		}
	}
	
	public static void delete() {
		System.out.print("Enter Employee ID:");
		String ID = input.nextLine();
		//get from json file with given ID and remove.
		
	}
	
	//For hourly worker
	public static void postTimeCard() {
		System.out.print("Enter Employee ID: ");
		String ID = input.nextLine();
		System.out.print("Enter number of hours worked: ");
		int hours = input.nextInt();
		LocalDate date = LocalDate.now();
		TimeCard card = new TimeCard(date,hours);
		JSONController.addTimeCard(card);
		card.displayTimeCard(ID);
	}
	
	//for salary worker
	public static void postSalesCard() {
		System.out.print("Enter Employee ID: ");
		String ID = input.nextLine();
		System.out.print("Enter number of sales: ");
		int sales = input.nextInt();
		System.out.println("Enter cost per sale: ");
		double costPer = input.nextDouble();
		LocalDate date = LocalDate.now();
		//get the time card for employee from json records.
		SalesCard card = new SalesCard(date,costPer,sales);
		card.displaySalesCard(ID);
	}
}
