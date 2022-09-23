import java.util.Scanner;

class ModeFinding {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = getNumOfIntegers(input);

        int[] array = getNumbersFromUser(num, input);
        int mode = new ModeFinding().mode(array);
        System.out.println("Mode is: " + mode);
    }

    public int mode(int[] array) {
        // As all numbers are only 0-100
        // declare a map which will keep freq of numbers
        int[] map = new int[101];
        int maxFreq = 0;
        for (int i = 0; i < array.length; i++) {
            // inc freq by one each time we see this number
            map[array[i]]++;
            // check if this is a new high number freq.
            // if so save
            if (maxFreq < map[array[i]]) {
                maxFreq = map[array[i]];
            }
        }

        // now start checking from 0 to 100 for which lowest number is maxFreq
        for (int i = 0; i < map.length; i++) {
            if (map[i] == maxFreq) {
                // this is the mode you are searching
                return i;
            }
        }

        // by default, we can always return first number
        return array[0];
    }


    private static int getNumOfIntegers(Scanner input) {
        System.out.println("Enter the number of integers to sort:");
        return input.nextInt();
    }

    private static int[] getNumbersFromUser(int num, Scanner input) {
        int i;
        int[] array = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }

        return array;
    }
}

