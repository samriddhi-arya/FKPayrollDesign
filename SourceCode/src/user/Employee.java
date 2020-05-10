package user;

public class Employee {

	private String ID;
	private String name;
	private String contactNo;
	private double accountSummary;
	Union member;
	
	
	public String getID(){ return ID; }
	
	public String getName() { return name; }
	
	public String getContact() { return contactNo; }
	
	public double getAccountSummary() { return accountSummary; }
	
	public void addEmployee(String name,String contactNo,boolean isUnion) {
		this.ID = Generate.getRandom();
		this.name = name;
		this.contactNo = contactNo;
		if(isUnion) {
			member = new Union();
		}
	}
}
