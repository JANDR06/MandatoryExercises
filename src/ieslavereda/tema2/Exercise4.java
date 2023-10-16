package ieslavereda.tema2;
import java.util.Scanner;

/**
 * Given a text, entered by the user, remove all the duplicated words except double r and double l.
 * Thus, "estoy  enn laa villa del  perroo" should be transformed to "estoy en la villa del perro". Be careful with double spaces too.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();
        String aux = "";

        for (int i = 1; i < phrase.length(); i++) {
            if ((phrase.charAt(i - 1) != phrase.charAt(i))
                    || ((aux.length()>= 1 && ((phrase.charAt(i-1)=='r' && phrase.charAt(i-2)!='r') || (phrase.charAt(i-1)=='l' && phrase.charAt(i-2)!='l'))))
                    || (aux.length()== 0 && (phrase.charAt(i-1)=='l' || phrase.charAt(i-1)=='r')))

                aux = aux + phrase.charAt(i - 1);
        }

        aux = aux + (phrase.charAt(phrase.length() - 1));
        phrase = aux;

        System.out.println(phrase);
    }


}
