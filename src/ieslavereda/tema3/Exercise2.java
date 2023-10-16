package ieslavereda.tema3;

/**
 * Create an array of numbers where the size of the array will be determined by the user (keyboard),
 * then fill the array with random numbers between 0 and 9,
 * and at the end show in the screen the value of each position and the sum of all values.
 * Make four methods:
 *     A method to fill the array (having as parameters the range - lower and upper limit - of the random numbers generated).
 *     A method to show the content.
 *     A method to sum the array.
 *     A method to generate random number (you can use it for other exercises).
 */

public class Exercise2 {

    public static void main(String[] args) {
        int[] vector = new int[Input.getInteger("Enter the vector dimension: ")];
        int lower = Input.getInteger("Enter the lower limit of the random limit: ");
        int upper = Input.getInteger("Enter the upper limit of the random limit: ");
        Input.fillArray(vector, lower, upper);
        Show.show(vector);
        System.out.println("Sum of the array elements: " + Tools.sumArray(vector));
    }

}
