package control;

import java.util.Scanner;
import java.util.Vector;

import model.Exporter;
import model.Traveller;
import service.Display;
import service.Validation;

class User {
	
	static Scanner scan = new Scanner(System.in);
	
	static String name, phno, fromLocation, toLocation;
	static int age;
	
	static Validation validation = new Validation();
	
	static boolean basicDetails() {
		
		System.out.print("Enter Your Name : ");	// Asking User to Give Name
		name = scan.nextLine();	// Taking the Name
		
		System.out.print("Enter Your Age : ");	// Asking User to give Age
		age = scan.nextInt();	// Taking the Age
		
		scan.nextLine();	// Reading \n for proper reading Phno String
		
		System.out.print("Enter Your Contact No : ");	// Asking User to give Contact Number
		phno = scan.nextLine();	// Taking Contact Number
		
		
		if(validation.validUser(age, phno)) {
			System.out.print("Enter From Location : ");
			fromLocation = scan.nextLine();
			System.out.print("Enter To Location : ");
			toLocation = scan.nextLine();
			return true;
		}
		return false;
		
	}
	
	public static Traveller traveller() {
		System.out.println("\nHello, Traveller !");	// Welcoming Traveller
		if(basicDetails()) {
			System.out.print("Enter Minimum Credit : ");
			double credit = scan.nextDouble();
			scan.nextLine();
			Traveller traveller = new Traveller(name, age, phno, fromLocation, toLocation, credit);
			System.out.println("You'have Successfully Registered !");
			return traveller;
		}
		return null;
	}
	public static Exporter exporter() {
		System.out.println("\nHello, Exporter !");	// Welcoming Exporter
		if(basicDetails()) {
			System.out.print("Enter Single line Good-Type : ");
			String goodType = scan.nextLine();
			System.out.print("Enter Maximum Credit : ");
			double debt = scan.nextDouble();
			scan.nextLine();
			
			Exporter exporter = new Exporter(name, age, phno, fromLocation, toLocation, goodType, debt);
			return exporter;
		}
		return null;
	}
	public static boolean administrator(Vector<Traveller> travellerList) {
		System.out.print("\nEnter Username : ");
		String username = scan.nextLine();
		System.out.print("Enter Password : ");
		String password = scan.nextLine();
		if(validation.validAdmin(username, password)) {
			int choice;
			Display display = new Display();
			do{
				System.out.println("\n1-Display\t2-Exit\t\t0-Close");
				System.out.print("Enter Your Choice : ");
				choice = scan.nextInt();
				switch(choice) {
					case 1:
						display.displayTravellerList(travellerList);
						break;
					case 2:
						// Exit
						break;
					case 0:
						System.out.println("\nYou're about to exit !");	// Displaying Exiting Message
						return false;
					default:
						System.out.println("\nIn-valid Option, Retry Again !");	// Displaying Invalid Option entry Message
				}
			}while(choice!=2);
			scan.nextLine();
		}
		else {
			System.out.println("In-Valid Username and Password");
		}
		return true;
			
	} 

}
