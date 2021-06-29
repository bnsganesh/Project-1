package model;

public class Exporter extends Person{
	
	String goodType;	// Specifying the Goodie Type 
	double debt;	// Maximum Debt
	
	
	public Exporter() { }

	public Exporter(String name, int age, String phno, String fromLocation, String toLocation, String goodType, double debt) {
		super(name, age, phno, fromLocation, toLocation);
		this.goodType = goodType;
		this.debt = debt;
	}
	
	public String getGoodType() {
		return goodType;
	}
	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	public void display() {
		System.out.print("[ "+name+"  "+age+"  +91"+phno+"  "+fromLocation+" -> "+toLocation+"  "+goodType+"  Rs. "+debt+" ]\n");
	}
}
