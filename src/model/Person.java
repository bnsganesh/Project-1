package model;

public class Person {
	String name;	// Name of the Person
	int age;	// Age of the Person
	String phno;	// Phone Number in String Format, since it's unsupported through Integer
	String fromLocation;	// From Location
	String toLocation;	// To Location
	
	
	public Person() { }

	public Person(String name, int age, String phno, String fromLocation, String toLocation) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	
}
