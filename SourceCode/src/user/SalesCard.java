package user;

import java.time.LocalDate;

public class SalesCard {

	LocalDate date;
	double costPerSale;
	int numberOfSales;
	
	public SalesCard(LocalDate date, double costPerSale,int numberOfSales) {
		this.date = date;
		this.costPerSale = costPerSale;
		this.numberOfSales = numberOfSales;
	}
	
	public void displaySalesCard(String ID) {
		System.out.println("Sales card for Employee " + ID);
		System.out.println("Date: " + date);
		System.out.println("Cost per sale: " + costPerSale);
		System.out.println("Number of sales: " + numberOfSales);
		System.out.println("Total cost of sales: " + costPerSale*numberOfSales);
	}
}
