import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int carCount = 0;
		String choice = "y";
		String makes;
		String model;
		int year = 0;
		double price = 0.0;
		Cars carObj;
				
		ArrayList<Cars> carsList = new ArrayList<Cars>(carCount);
		System.out.println("Welcome to the Grand Circus Motors admin console! ");
		System.out.println();
		
		
		while (choice.equalsIgnoreCase("y")) {
			
		System.out.println("How many cars are you entering: ");
		
		carCount = scnr.nextInt();
		
		scnr.nextLine();
		
						
		for (int i = 0; i < carCount; i++) {
			
		    makes = Validator.getString(scnr, "Enter Car Make: ");
			
			
			// System.out.println("Enter Car Model: " );
			model = Validator.getString(scnr, "Enter Car Model: ");
			
			//System.out.println("Enter Car Year: ");
			year = Validator.getInt(scnr, "Enter Car Year: ");
			//System.out.println("Enter Car Price: ");
			price = Validator.getDouble(scnr, "Enter Car Price: ");
			//scnr.nextLine();
			carObj = new Cars(makes, model, year, price);
			carsList.add(carObj);
		}
		
		System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Make", "Model", "Year", "   ", "Price");
		for (int j = 0; j < carsList.size(); j++ )
		System.out.println(carsList.get(j).toString());
		
		System.out.println("Would you like to enter another number? y/n: ");
		choice = scnr.next();
				
		}
		System.out.println("The end!!!");
		scnr.close();
	}

}
