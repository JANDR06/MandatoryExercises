package ieslavereda.tema2;
import java.util.Scanner;

/**
 * Transform the next "switch" code into a sequence of "if"
 */

public class Exercise1 {
    public static void main(String[] args) {
        int valor;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value: ");
        valor = sc.nextInt();

        if (valor == 1) {
            System.out.println("Hello");
        } else if (valor == 2) {
            System.out.println("Nice to meet you");
        } else if (valor==3) {
            System.out.println("Bye");
        } else {
            System.out.println("I don't know what to say");
        }

    }
}