package ieslavereda.tema2;
import java.util.Scanner;

/**
 * Make a program that draws a square matrix from a value entered by the user
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int size = String.valueOf(num*num).length();

        //recorremos las columnas
        for (int l = 1, k = 1; k <= num * num; l++, k = num * l) {
            //recorremos las filas
            for (int j = 0; j < num; j++) {
                System.out.print(formateaNumero(i++, size) + " ");
            }
            System.out.println();
        }
    }

    /**
     * formatea un número añadiendo ceros a la izquierda según el tamaño que se le pasa por parámetro
     * @param numero: el numero a formatear
     * @param tamanyo: tamaño máximo de los números a imprimir
     * @return cadena con el número formateado
     */
    public static String formateaNumero(int numero, int tamanyo) {
        String numeroCadena = String.valueOf(numero);
        for (int i = numeroCadena.length(); i < tamanyo; i++) {
            numeroCadena = "0"+numeroCadena;
        }
        return numeroCadena;
    }

}
