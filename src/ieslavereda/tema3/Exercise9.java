package ieslavereda.tema3;

/**
 * Create Java program to read the height of N people and calculate the average height.
 * Calculate how many people have a height above the average and how many have a height below the average.
 * The value of N is requested by keyboard and must be a positive integer.
 */

public class Exercise9 {
    public static void main(String[] args) {
        int N = 0;
        while (N<=0)
            N = Input.getInteger("Please, enter the height array dimension: ");

        double[] heights = new double[N];
        double sum = 0.0;
        sum = Input.fillArrayAndGetSum(heights, sum);
        double average = sum/ heights.length;
        System.out.println(average + " is the average");
        System.out.println(Tools.countAbove(heights, average) + " people are above average");
        System.out.println(Tools.countBelow(heights, average) + " people are below average");
    }
}
