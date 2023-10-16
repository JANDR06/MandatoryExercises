package ieslavereda.tema1;
import java.util.Scanner;

/**
 * Create a program that indicates if a number entered by keyboard is positive, negative or zero.
 */
public class Exercise4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        if (n>0) {
            System.out.println("The number entered is positive");
        } else {
            if (n<0) {
                System.out.println("The number entered is negative");
            } else {
                System.out.println("The number entered is zero");
            }
        }
    }
}
