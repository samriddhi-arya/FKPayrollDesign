package user;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		System.out.println("__________Select a use case__________");
		System.out.println("1. Add a new employee");
		System.out.println("2. Delete an employee");
		System.out.println("3. Post a time card");
		System.out.println("4. Post a sales receipt");
		System.out.println("5. Post union membership details");
		System.out.println("6. Change employee details");
		System.out.println("7. Run the payroll for today(Can Access between 7:00 pm and 7:15 pm)");
		System.out.println("-1. Exit");
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Option.");
		int option = input.nextInt();
		switch(option){
		case -1:
			System.out.println("Exiting the system.");
			return;
		case 1: 
			System.out.println("Adding a new Employee. Please Enter the details below: ");
			EmployeeController.add();
			System.out.println("New Employee Added.");
			break;
		default:
			System.out.println("Enter a valid Option.");
			break;
		}
		input.close();
	}
}
