package ieslavereda.tema1;

/**
 * Create a program to display an integer variable (the integer value must be declared). This variable will contain a random value from 0.0 to 9.999999
 * and will be multiplied by PI. Once displayed, add 70 to this number using an assignment operator and assign it to a char variable.
 * Display this char variable, and by using an unary operator its follower one)
 */

public class Exercise2 {

    public static void main(String[] args)
    {
        int i = (int) (Math.random()*10*Math.PI);
        System.out.println("Resultado " + i);

        i += 70;

        char letra = (char) i;
        System.out.println(letra++);
        System.out.println(letra);
    }
}
