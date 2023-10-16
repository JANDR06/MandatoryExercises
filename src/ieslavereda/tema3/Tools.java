package ieslavereda.tema3;

public class Tools {

    /**
     * It sums the array elements values
     * @param v the vector of integers
     * @return the sum
     */
    public static int sumArray(int[] v) {
        int sum = 0;
        for (int e : v) {
            sum += e;
        }
        return sum;
    }

    /**
     * It gets the array values average
     * @param v the vector of integers
     * @return the average
     */
    public static double avgArray(int[] v) {
        double avg = 0.0;
        for (int e : v) {
            avg += e;
        }
        return avg / v.length;
    }

    /**
     * Counts how many values are above the average
     *
     * @param heights the array
     * @param average the average
     * @return the count of elements having a value greater than the average
     */
    public static int countAbove(double[] heights, double average) {
        int count = 0;
        for (double height : heights) {
            if (height > average)
                count++;
        }
        return count;
    }

    /**
     * Counts how many values are below the average
     *
     * @param heights the array
     * @param average the average
     * @return the count of elements having a value lower than the average
     */
    public static int countBelow(double[] heights, double average) {
        int count = 0;
        for (double height : heights) {
            if (height < average)
                count++;
        }
        return count;
    }

    /**
     * This method calculates the average of the positive numbers
     *
     * @param v the vector of integers
     * @return the average as a double
     */
    public static double averagePos(int[] v) {
        double sum = 0.0;
        int count = 0;
        for (int e : v) {
            if (e > 0) {
                count++;
                sum += e;
            }
        }
        return (count != 0) ? sum / count : count;
    }

    /**
     * This method calculates the average of the negative numbers
     *
     * @param v the vector of integers
     * @return the average as a double
     */
    public static double averageNeg(int[] v) {
        double sum = 0.0;
        int count = 0;
        for (int e : v) {
            if (e < 0) {
                count++;
                sum += e;
            }
        }
        return (count != 0) ? sum / count : count;
    }

    /**
     * It counts the amount of positive, negative and zeros
     *
     * @param vector an array of integers
     * @return an array of 3 where element 0 contains the amount of positive numbers, element 1 the negatives and 2 the zeros
     */
    public static int[] countPNZ(int[] vector) {
        int[] count = new int[3];
        for (int element : vector) {
            if (element < 0)
                count[1]++;
            else if (element > 0)
                count[0]++;
            else count[2]++;
        }
        return count;
    }

    /**
     * checks whether a number is a prime number
     * @param prime the number to be analyzed
     * @return true if the number is prime
     */
    public static boolean isPrime(int prime) {
        boolean actualPrime = true;
        int j=prime-1;
        while(actualPrime && j>=2){
            if (prime%j==0)
                actualPrime=false;
            j--;
        }
        return actualPrime;
    }

    /**
     * Returns the greatest element of the array
     * @param vector to be analyzed
     * @return the greatest value
     */
    public static int selectGreatest(int[] vector){
        int great = vector[0];
        for (int element : vector) {
            if (element > great)
                great = element;
        }
        return great;
    }
}
