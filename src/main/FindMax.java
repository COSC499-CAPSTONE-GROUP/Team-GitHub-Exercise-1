package main;

public class FindMax {
	public static int findMax(int[] input) {
		
		//Initialize max value to be first element of array
		int max = input[0];
		
		//Iterate through the array and compare each element to the current max value
		for(int i = 1; i < input.length; i++) {
			//If the comparing value is greater than the current max value, update max value
			if(input[i] > max)
				max = input[i];
		}
		
		//Return the max value
		return max;
	}
}
