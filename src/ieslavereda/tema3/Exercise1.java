package ieslavereda.tema3;

/**
 * Create an array of 10 numbers, values will be entered by keyboard.
 * Then, display by console the index and the value of all the elements.
 * You have to perform two methods, one to fill the element values and another one to show them.
 */

public class Exercise1 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Input.fillArray(vector);
        Show.show(vector);
    }


}
