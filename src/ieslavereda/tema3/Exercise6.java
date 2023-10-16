package ieslavereda.tema3;

/**
 * Create a program that calculates the letter of the DNI of any person.
 * To calculate the letter you must divide the DNI by 23, and the rest look for it in the following list:
 * <p>
 * Position       0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	10 	11 	12 	13 	14 	15 	16 	17 	18 	19 	20 	21 	22
 * char        	T 	R 	W 	A 	G 	M 	Y 	F 	P 	D 	X 	B 	N 	J 	Z 	S 	Q 	V 	H 	L 	C 	K 	E
 */

public class Exercise6 {
    public static void main(String[] args) {
        char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int dni = Input.getInteger("Please, enter a DNI number: ");
        System.out.println("Letter is: " + letters[dni%23]);
    }
}
