package ieslavereda.tema4;

/**
 * Code the following 3 programs:
 *
 * 1. Create a vector for storing disordered Strings (in upper case). Then, return the vector sorted - with the same Strings sorted in ascending order (A-Z),
 * using the selection sort algorithm.
 */

public class Exercise1 {
    public static void main(String[] args) {

        // Exercice 1
        exercici1();

    }

    public static void exercici1() {
        int num = Input.getInteger("Please, introduce the String vector dimension: ");
        String[] words = new String[num];
        fillArray(words);
        Show.show(words);
        Sorting.selectionSort(words);
        Show.show(words);
    }

    public static void fillArray(String[] words) {
        int base = 'A';

        for (int i = 0; i < words.length; i++) {
            int randomSize = (int) (Math.random() * 20);
            String addWord = "";
            for (int j = 0; j < randomSize; j++) {
                int random = (int) (Math.random() * 26 + base);
                addWord += (char) random;
            }
            words[i] = addWord;
        }

    }

}
