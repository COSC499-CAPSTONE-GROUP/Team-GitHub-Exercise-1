// this class will calculate and return the mean of an array
package main;
//importing packages
import java.beans.Transient;  
import java.util.*;
// class definition
    public class mean{
         // method to calculate the mean of an arr
        public static int calculateMean(int[] arr){

            int sum = 0; // variable to store the mean
            // for loop will calculate sum of all elements in the array
            for(int i=0;i< arr.length; i++){
            sum += arr[i];
        }
        // finally the sum will be divided by the length of the array to get the mean
            sum = sum/arr.length;
            // and the calculated mean is returned
            return sum;
    }
}

 

 


