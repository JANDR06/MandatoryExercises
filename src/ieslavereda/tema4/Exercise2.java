package ieslavereda.tema4;

/**
 * Code the following 3 programs:
 *
 * 2. Create a two-dimensional vector containing the name and height of people.
 *  The program should return a list of people ordered by height in ascending order. Use the mergesort algorithm.
 */

public class Exercise2 {
    public static void main(String[] args) {

        //Exercice 2
        exercici2();

    }

    public static void exercici2() {
        int num = Input.getInteger("How many people to store? ");
        String[][] people = new String[2][num];
        fillInformation(people);
        Show.show(people);
        Sorting.mergeSort(people,0,people[0].length);
        Show.show(people);
    }

    public static void fillInformation(String[][] matrix) {
        // In each row, element 0 stores the student's name and element 1 student's height
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = Input.getString("Person's name #" + i + "? ");
            double height = Input.getDouble("Person's height: ");
            matrix[1][i] = String.valueOf(height);
        }
    }

}
