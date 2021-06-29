package model;

public class Traveller extends Person{
	
	double credit;	// Minimum Credit
	
	
	
	public Traveller() { }

	public Traveller(String name, int age, String phno, String fromLocation, String toLocation, double credit) {
		super(name, age, phno, fromLocation, toLocation);
		this.credit = credit;
	}
	
	
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public void display() {
		System.out.print("[ "+name+"  "+age+"  +91"+phno+"  "+fromLocation+" -> "+toLocation+"  Rs. "+credit+" ]\n");
	}
}
