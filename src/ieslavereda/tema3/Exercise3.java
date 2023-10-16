package ieslavereda.tema3;

/**
 * Make an array of numbers for storing 100 integers which will contain numbers from 1 to 100.
 * Get the sum of all of them and the average.
 */

public class Exercise3 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        Input.fillArray(vector, 1, 100);
        System.out.println("The sum is: " + Tools.sumArray(vector));
        System.out.println("Average of the array elements: " + Tools.avgArray(vector));
    }
}
