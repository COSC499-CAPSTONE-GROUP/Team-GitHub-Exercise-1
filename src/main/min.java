package main;

public class min {

    public static int findMin (int [] array1) {
        // Variable to hold the minimum value
        int minimum = array1[0];

        // Loop checking through array for minimum value
        for (int i = 1; i < array1.length; i++)
            // If the minimum value happens to be greater than another value in the array, the minimum will hold the lesser value
            if (minimum > array1[i])
                minimum = array1[i];
        
        // Returns the minimum value
        return minimum;
    }
}
