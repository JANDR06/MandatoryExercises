package ieslavereda.tema3;

import java.util.Scanner;

public class Input {
    /**
     * Get an integer from console
     * @param message is the message to show by console
     * @return the integer entered by console
     */
    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.err.println("Please, enter an integer");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Get a byte from console
     * @param message is the message to show by console
     * @return the byte entered by console
     */
    public static byte getByte(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextByte()) {
            System.err.println("Please, enter an integer");
            sc.next();
        }
        return sc.nextByte();
    }

    /**
     * Get a real number from console
     * @param message is the message to show by console
     * @return the double entered by console
     */
    public static double getDouble(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            System.err.println("Please, enter a real number");
            sc.next();
        }
        return sc.nextDouble();
    }

    /**
     * Get a String from console
     * @param message is the message to show by console
     * @return the String entered by console
     */
    public static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }

    /**
     * It fills an integer vector with values from the console
     * @param v the vector
     */
    public static void fillArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = getInteger("Please, enter the integer in position #" + i + " :");
        }
    }

    /**
     * It fills an integer vector with random values from determined range
     * @param v the vector
     * @param lower lower limit
     * @param upper upper limit
     */
    public static void fillArray(int[] v, int lower, int upper) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()*(upper+1-lower))+lower;
        }
    }

    /**
     * This method fills an array with doubles and return the sum of the elements
     * @param heights the array of doubles
     * @param sum the sum initialized to zero
     * @return the sum as a double
     */
    public static double fillArrayAndGetSum(double[] heights, double sum) {
        for (int i = 0; i < heights.length; i++) {
            heights[i] = Input.getDouble(" Please, enter the height for element #" + i + ": ");
            sum += heights[i];
        }
        return sum;
    }

    /**
     * It fills an array with chars from A to Z (not having the Ñ letter)
     * @param letters the vector containing the alphabet
     */
    public static void fillArrayLetters(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('A' + i);
        }
    }

    /**
     * Fills an array with prime numbers within a range
     * @param v vector to be filled
     * @param lower lower limit
     * @param upper upper limit
     */
    public static void fillPrime(int[] v, int lower, int upper) {
        for (int i = 0; i < v.length; i++) {
            int prime=(int) (Math.random()*(upper+1-lower))+lower;
            while (!Tools.isPrime(prime))
                prime = (int) (Math.random()*(upper+1-lower))+lower;
            v[i] = prime;
        }
    }

}
