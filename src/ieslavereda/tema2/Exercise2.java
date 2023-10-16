package ieslavereda.tema2;

/**
 * Make a program that prints the following sequence of numbers using a for sentence.
 0 -1 2 -3 4 -5 6 -7 8 -9 10
 */

public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print(-i+" ");
        }
        System.out.println();
    }
}
