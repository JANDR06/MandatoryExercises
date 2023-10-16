package ieslavereda.tema3;

/**
 * Create a program for filling an array with 10 integers entered by user by keyboard.
 * Then calculate and show the average of the positive values and the negative values of the array.
 */

public class Exercise8 {
    public static void main(String[] args) {
        int[] integers = new int[10];
        Input.fillArray(integers);
        System.out.println(Tools.averagePos(integers) + " is the average of positive values");
        System.out.println(Tools.averageNeg(integers) + " is the average of negative values");
    }
}
