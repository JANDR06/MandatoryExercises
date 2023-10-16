package ieslavereda.tema2;
import java.lang.Math;

/**
 * Make a program that shows letters randomly, indicating whether they are vowels or consonants.
 * Tip: You can use the ASCII code. You can generate integers and transform them to char with a explicit casting.
 */
public class Exercise3 {

    public static void main(String[] args) {
        // A-65 <--> Z-90
        for (int i = 0; i < 100; i++) {
            int a = (int)(Math.random()*26)+65;
            char c = (char) a;
            String st;
            if (c == 'A' || c== 'E' || c=='I' || c=='O' || c == 'U')
                st = "vowel";
            else
                st = "consonant";

            System.out.println("Letter: " + c + " is a " + st);

        }

    }

}
