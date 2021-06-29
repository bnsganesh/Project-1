package service;

public class Validation {
	
	public boolean validUser(int age, String phno) {
		
		if(age < 18) {
			System.out.println("\nYou're In-Eligible !");
			return false;
		}
		else {
			if(phno.length() == 10) {
				for(int i=0; i<phno.length(); i++)
					if( phno.charAt(i) < '0' || phno.charAt(i) > '9')
						return false;
			}
			else {
				System.out.println("\nYou've Entered Wrong Contact-Number !");
				return false;
			}
		}
		
		return true;
	}
	public boolean validAdmin(String username, String password) {
		if(username.equals(username) && password.equals(password)) {
			return true;
		}
		else
			return false;
	}
}
