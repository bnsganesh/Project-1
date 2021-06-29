package service;

import java.util.Scanner;
import java.util.Vector;

import model.Exporter;
import model.Traveller;

public class CheckOut {
	public void allocateTraveller(Vector<Traveller> travellerList, Exporter exporter) {
		Display display = new Display();
		String indexes = " ";
		boolean found = false;
		System.out.println("--------------------------- Traveller Details ---------------------------\n");
		for(int i=0; i<travellerList.size(); i++) {
			if( travellerList.get(i).getFromLocation().equals(exporter.getFromLocation()) 
					&& travellerList.get(i).getToLocation().equals(exporter.getToLocation())
					&& travellerList.get(i).getCredit() <=exporter.getDebt()	) {
				
				indexes += i + " ";
				System.out.print(i+"\t");
				travellerList.get(i).display();
				found = true;
			}
		}
		System.out.println("-------------------------------------------------------------------------\n");
		if(found) {
			System.out.print("\nEnter the Traveller Id ("+indexes+") : ");
			Scanner scan = new Scanner(System.in);
			int index = scan.nextInt();
			scan.nextLine();
			System.out.println("\n--------------------------- Check-Out Details ---------------------------\n");
			System.out.print("Traveller : ");
			travellerList.get(index).display();
			travellerList.remove(index);
			System.out.print("Exporter  : ");
			exporter.display();
			System.out.println("-------------------------------------------------------------------------\n");
		}
		else {
			System.out.println("No Traveller Found, Retry Later !");
		}
		
	}
}
