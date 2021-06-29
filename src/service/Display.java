package service;

import java.util.Vector;

import model.Exporter;
import model.Traveller;

public class Display {
	public void displayTravellerList(Vector<Traveller> travellerList) {
		System.out.println("--------------------------- Traveller Details ---------------------------\n");
		for(int i=0; i<travellerList.size(); i++) {
			System.out.print(i+"\t");
			travellerList.get(i).display();
		}
		System.out.println("-------------------------------------------------------------------------\n");
	}
}
