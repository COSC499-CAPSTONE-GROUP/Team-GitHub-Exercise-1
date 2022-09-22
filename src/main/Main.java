package main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter seven integers (whole numbers):");
		int[] array = new int[7];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		
		System.out.println("\nWhat would you like to do with these numbers: "
				+ "\n 1. Find maximum value"
				+ "\n 2. Find minimum value"
				+ "\n 3. Find mean value"
				+ "\n 4. Find mode value");
		
		System.out.println("Please enter 1, 2, 3, or 4: ");
		int feature = s.nextInt();
		
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
		
		System.out.println("\nThanks for using our program! Have a good day :)");
			
	}

}
