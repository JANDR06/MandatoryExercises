package ieslavereda.tema4;
public class Sorting {

    /**
     * Selection sort algorithm for Strings
     * @param array the String vector to be sorted
     */
    public static void selectionSort(String[] array) {
        int posMin;
        /* Recorremos el array hasta la penúltima posición */
        for (int i = 0; i < array.length - 1; i++) {
            /*me guardo en posMin la posición inicial del elemento mínimo */
            posMin = i;
            /* ahora buscamos el elemento mínimo en la parte del array no ordenado, y nos guardamos su posición en posMin) */
            for (int j = i + 1; j <= array.length - 1; j++) {
                int num = array[j].compareTo(array[posMin]);
                if (num < 0)
                    posMin = j;
            }
            /* Intercambiamos la posición del elemento mínimo */
            if (posMin != i)
                swap(array, posMin, i);
        }
    }

    /**
     * Swapping two String elements from a vector
     * @param v the String vector
     * @param i position 1 to be interchanged
     * @param j position 2 to be interchanged
     */
    private static void swap(String[] v, int i, int j) {
        String aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    /**
     * Swapping two String elements from a matrix
     * @param v the String matrix
     * @param i position 1 to be interchanged
     * @param j position 2 to be interchanged
     */
    private static void swap(String[][] v, int i, int j) {
        for (int k = 0; k < v.length; k++) {
            String aux  = v[k][i];
            v[k][i] = v[k][j];
            v[k][j] = aux;
        }
    }

    /**
     * Sorting a String matrix using the quickSort algorithm
     * @param v matrix of Strings
     * @param left initial position
     * @param right final position
     */
    public static void quickSort(String[][] v, int left, int right) {

        String pivot = v[0][(left + right) / 2];
        int i = left;
        int d = right;

        do {
            int compare = v[0][right].compareTo(pivot);
            while (compare > 0) {
                right--;
                compare = v[0][right].compareTo(pivot);
            }
            compare = v[0][left].compareTo(pivot);
            while (compare < 0) {
                left++;
                compare = v[0][left].compareTo(pivot);
            }
            if (left <= right) {
                swap(v, left, right);
                left++;
                right--;
            }
        } while (left < right);

        if (left < d)
            quickSort(v, left, d);

        if (right > i)
            quickSort(v, i, right);

    }

    /**
     * Sorting a String matrix using the mergeSort algorithm
     * @param v matrix of Strings
     * @param start initial position
     * @param size of the matrix
     */
    public static void mergeSort(String[][] v, int start, int size) {
        int longitud1, longitud2;
        if (size > 1) {
            longitud1 = size / 2;
            longitud2 = size - longitud1;

            mergeSort(v, start, longitud1);
            mergeSort(v, start + longitud1, longitud2);
            merge(v, start, longitud1, longitud2);
        }
    }

    /**
     * Method to merge two matrix in a sorted way
     * @param v matrix of Strings
     * @param start position for merging
     * @param longitud1 initial position to merge
     * @param longitud2 final position to merge
     */
    private static void merge(String[][] v, int start, int longitud1, int longitud2) {
        String[][] buffer = new String[2][longitud1 + longitud2];
        int i1 = 0, i2 = 0, iBuffer = 0;

        while ((i1 < longitud1) && (i2 < longitud2)) {
            int comp = v[1][start + i1].compareTo(v[1][start + longitud1 + i2]);
            if (comp < 0) {
                buffer[0][iBuffer] = v[0][start + i1];
                buffer[1][iBuffer] = v[1][start + i1];
                i1++;
                iBuffer++;
            } else {
                buffer[0][iBuffer] = v[0][start + longitud1 + i2];
                buffer[1][iBuffer] = v[1][start + longitud1 + i2];
                i2++;
                iBuffer++;
            }
        }

        while (i1 < longitud1) {
            buffer[0][iBuffer] = v[0][start + i1];
            buffer[1][iBuffer] = v[1][start + i1];
            i1++;
            iBuffer++;
        }
        while (i2 < longitud2) {
            buffer[0][iBuffer] = v[0][start + longitud1 + i2];
            buffer[1][iBuffer] = v[1][start + longitud1 + i2];
            iBuffer++;
            i2++;
        }
        for (int i = 0; i < buffer[0].length; i++) {
            v[0][start + i] = buffer[0][i];
            v[1][start + i] = buffer[1][i];
        }
    }
}

