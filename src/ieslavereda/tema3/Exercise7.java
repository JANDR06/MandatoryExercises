package ieslavereda.tema3;

/**
 * Create a program with 10 integers entered by the keyboard.
 * The program must be able to know how many numbers are positive, negative or cero.
 */

public class Exercise7 {
    public static void main(String[] args) {
        int[] integers = new int[10];
        Input.fillArray(integers);
        int[] count = Tools.countPNZ(integers);
        System.out.println( count[0] + " of the array are positive");
        System.out.println( count[1] + " of them are negative");
        System.out.println( count[2] + " are zero");
    }

}
