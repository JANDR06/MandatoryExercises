package ieslavereda.tema1;
import java.util.Scanner;

/**
 * Modify exercise one so that an error is displayed if the user selects a wrong letter
 */
public class Exercise5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a word: ");
        String palabra = sc.nextLine();
        int lon = palabra.length();
        System.out.print("Select the letter to display: ");
        int pos = sc.nextInt();
        if (pos <= 0 || pos > lon) {
            System.out.println("Position out of range");
        } else {
            System.out.println("The word selected is the letter:  " + palabra.charAt(--pos));
        }
    }
}
