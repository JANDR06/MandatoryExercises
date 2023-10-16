package ieslavereda.tema3;

/**
 * Create an array of numbers having a size entered by user (keyboard).
 * The array will contain random prime numbers within a desired range.
 * Finally, the program shows the largest one.
 */

public class Exercise4 {
    public static void main(String[] args) {
        int[] vector = new int[Input.getInteger("Enter the vector dimension: ")];
        int lower = Input.getInteger("Enter the lower limit of the random limit: ");
        int upper = Input.getInteger("Enter the upper limit of the random limit: ");

        Input.fillPrime(vector, lower, upper);
        Show.show(vector);
        System.out.println("The greatest value is: " + Tools.selectGreatest(vector));
    }
}