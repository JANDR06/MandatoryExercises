package ieslavereda.tema1;
import java.util.Scanner;

/**
 * Create a program to display the selected position of a letter (number entered by the console) within a word (entered also by keyboard)
 */

public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a word: ");
        String palabra = sc.nextLine();
        System.out.print("Select the letter to display: ");
        int pos = sc.nextInt();
        System.out.println("The word selected is the letter: " + palabra.charAt(--pos));
    }
}
