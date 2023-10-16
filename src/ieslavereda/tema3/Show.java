package ieslavereda.tema3;

public class Show {

    /**
     * Este método borra la terminal
     */
    public static void borrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * It shows the array content
     * @param v the vector of integers
     */
    public static void show(int[] v) {
        for (int i = 0; i < v.length; i++){
            System.out.println("Element in position #"+i+" value: " + v[i]);
        }
    }
}
