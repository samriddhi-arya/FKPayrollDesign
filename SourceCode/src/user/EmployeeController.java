package user;

import java.util.Scanner;

public class EmployeeController {

	public static void add() {
		Scanner input = new Scanner(System.in);
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
			emp.addEmployee(name,contact,isUnion,salary,commission);
		}
		else {
			System.out.print("Enter Hourly wages: ");
			double hourlyWage = input.nextDouble();
			HourlyEmployee emp = new HourlyEmployee();
			emp.addEmployee(name,contact,isUnion,hourlyWage);
		}
		
		input.close();
		
	}
}
