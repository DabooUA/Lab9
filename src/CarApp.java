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
		
		//System.out.println("You will be entering: " + carCount + " cars.");
				
		for (int i = 0; i < carCount; i++) {
			
			System.out.println("Enter Car Make: " );
			
			makes = scnr.nextLine();
			System.out.println("Enter Car Model: " );
			model = scnr.nextLine();
			
			System.out.println("Enter Car Year: ");
			year = scnr.nextInt();
			System.out.println("Enter Car Price: ");
			price = scnr.nextDouble();
			scnr.nextLine();
			carObj = new Cars(makes, model, year, price);
			carsList.add(carObj);
		}
		
		System.out.printf("%-20s %-20s %-20s %20s\n",  "Make",  "Model", "Year",  "---", "Price" );
		
		System.out.println(carsList);
		
		System.out.println("Would you like to enter another number? y/n: ");
		choice = scnr.next();
		System.out.println("The end!!!");
		
		}
		
		scnr.close();
	}

}
