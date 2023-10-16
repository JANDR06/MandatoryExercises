package ieslavereda.tema3;

/**
 * Create an array of characters containing from the 'A' to the 'Z' (only uppercase).
 * Then, you can ask for positions of the array by keyboard and if the position is correct,
 * it will be added to a string that will be shown at the end. Program stops when user introduce a -1 by the keyboard.
 */

public class Exercise5 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        Input.fillArrayLetters(letters);

        String word = "";
        int pos;
        do {
            pos = Input.getInteger("Enter a char array position: ");
            if (pos >=0 && pos < 26)
                word += letters[pos];
        } while (pos != -1);

        System.out.println(" Word is " + word);

    }
}
