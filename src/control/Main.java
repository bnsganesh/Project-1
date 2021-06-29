package control;

import java.util.Scanner;

import java.util.Vector;

import model.Exporter;
import model.Traveller;
import service.CheckOut;

public class Main {

	public static void main(String[] args) {
		
		Vector<Traveller> travellerList = new Vector<Traveller>();
		
		boolean exit = true;
		
		System.out.println("---------->>>>>---------- Welcome to Project #1 ----------<<<<<----------");	// Displaying the Welcome Text
		Scanner scan = new Scanner(System.in);	// scan for Taking Input from the User
		
		int user;
		do {
			System.out.println("\n-------------------------------------------------------------------------");
			System.out.println("1-Traveller\t2-Exporter\t3-Administartor");	// Displaying the User Options
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("Are You : ");	// Asking the User option
			try{
				user = scan.nextInt();	// Taking the User option
				switch(user) {
					case 1:
						Traveller traveller = User.traveller(); 
						if( traveller != null ) {
							travellerList.add(traveller);
							traveller.display();
						}
						break;
					case 2:
						Exporter exporter = User.exporter();
						if( exporter != null ) {
							exporter.display();
							CheckOut checkOut = new CheckOut();
							checkOut.allocateTraveller(travellerList, exporter);
						}
						break;
					case 3:
						exit = User.administrator(travellerList);
						break;
					default:
						System.out.println("\nIn-valid Option, Retry Again !");	// Displaying Invalid Option entry Message
				}
			}
			catch(Exception e) {
				System.out.println("\nAlert !!!\nYou've Entered mis-match Input.");
				break;
			}
				
		}while(exit);
		
		scan.close();// Closed Taking Input from the User
		System.out.println("\n--------<<<<<------- Thank You,  Project #1 Closed ! ------->>>>>--------");	// Displaying the Closing Text
		
	}

}
