package ieslavereda.tema4;

/**
 * Code the following 3 programs:
 *
 * 3. Implement exercice 2 but sort the matrix by ascending name and using the quicksort algorithm.
 */

public class Exercise3 {
    public static void main(String[] args) {

        //Exercice 3
        exercici3();

    }

    public static void exercici3() {
        int num = Input.getInteger("How many people to store? ");
        String[][] people = new String[2][num];
        fillInformation(people);
        Show.show(people);
        Sorting.quickSort(people,0,people[0].length-1);
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
