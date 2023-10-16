package ieslavereda.tema4;

/**
 * Class to display vectors and matrix
 */
public class Show {
    /**
     * Method to display a vector
     * @param v vector of Strings
     */
    public static void show(String[] v) {
        for (String word : v) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    /**
     * Method to display a matrix
     * @param v matrix of integers
     */
    public static void show(int[][] v) {
        for(int[] vector : v) {
            for (int element: vector) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /**
     * Method to display a matrix
     * @param v matrix of doubles
     */
    public static void show(double[][] v) {
        for (double[] vector : v) {
            for (double element : vector) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /**
     * Method to display a matrix
     * @param v matrix of Strings
     */
    public static void show(String[][] v) {
        int max = v[0][0].length();
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if (v[i][j].length() > max)
                    max = v[i][j].length();
            }
        }
        max += 3;

        for (int row = 0; row < v.length; row++) {
            String showText ="";
            for (int col = 0; col < v[row].length; col++) {
                if (v[row][col] != null)
                    showText = v[row][col];
                else
                    showText = " ";
                for (int i = showText.length(); i < max; i++) {
                    showText += " ";
                }
                System.out.print(showText);
            }
            System.out.println();
        }
    }
}
