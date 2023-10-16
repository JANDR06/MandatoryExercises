package ieslavereda.tema1;

/**
 * Create a program that simulates a coin toss using Math.random(). The program should show odd and even randomly
 */
public class Exercise3 {

    public static void main(String[] args)
    {
        int i = (int) (Math.random()*2);
        if (i==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
