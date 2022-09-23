package main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Initialize Scanner class to allow program to take user input
		Scanner s = new Scanner(System.in);
		
		//Initialize the array with a limit of 7 elements
		int[] array = new int[7];
		
		//Prompt the user to enter 7 integers
		System.out.println("Enter seven integers (whole numbers): ");
		//Each integer the user inputs is added to the array
		for(int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}

		//Display to the user what features are available
		System.out.println("\nWhat would you like to do with these numbers: "
				+ "\n 1. Find maximum value"
				+ "\n 2. Find minimum value"
				+ "\n 3. Find mean value"
				+ "\n 4. Find mode value");

		//Prompt the user to choose one of the four features
		System.out.println("Please enter 1, 2, 3, or 4: ");
		int feature = s.nextInt();

		//Determine which feature was chosen and display the results
		switch(feature) {
			case 1:
				System.out.println("\nThe maximum value is: ");
				break;
			case 2:
				System.out.println("\nThe minimum value is: ");
				break;
			case 3:
				System.out.println("\nThe mean value is: ");
				break;
			case 4:
				System.out.println("\nThe mode value is: ");
				break;
		}

		//Ending message to indicate to the user the program has stopped running
		System.out.println("\nThanks for using our program! Have a good day :)");
	}

}
