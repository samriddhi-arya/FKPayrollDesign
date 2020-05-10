package user;

import java.util.Random;

public class Generate {

	// Generates a Random number 0 of 10 digits for EmployeeID
	
	public static String getRandom() {
		int min = (int)Math.pow(10, 10);
		int max = Integer.MAX_VALUE;
		
		Random generator = new Random();
		Integer randInt = generator.nextInt(max-min+1)+min;
		
		return randInt.toString();
	}
}
