package main;

public class min {

    public static int findMin (int [] array1) {
        int minimum = array1[0];


        for (int i = 1; i < array1.length; i++)

            if (minimum > array1[i])
                minimum = array1[i];
        
        return minimum;
    }
}