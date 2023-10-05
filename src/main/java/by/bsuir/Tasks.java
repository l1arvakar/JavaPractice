package by.bsuir;

import java.util.ArrayList;

public class Tasks {
    //task 1
    public static double findSolution (final double x, final double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }

    //task 2
    public static boolean isPointBelongsArea(double x, final double y) {
        x = Math.abs(x);
        return (y > 0 && y <= 5 && x <= 4) || (y <= 0 && y >= -3 && x <= 6);
    }

    //task 3
    public static void printTgTable(final double a, final double b, final double h) {
        System.out.println("x     tg(x)");
        for (double i = a; i <= b; i += h) {
            System.out.printf("%5.3f %5.3f\n", i, Math.tan(i));
        }
    }

    //task 4
    public static ArrayList<Integer> findPrimeElements(int[] arr) {
        ArrayList<Integer> primeElementsArray= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeElementsArray.add(i);
            }
        }
        return primeElementsArray;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //task 5
    public static  int findMinimumDeletion(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        int[] longestSequence = new int[arr.length];
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            longestSequence[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && longestSequence[i] < longestSequence[j] + 1) {
                    longestSequence[i] = longestSequence[j] + 1;
                }
            }
            maxLen = Math.max(maxLen, longestSequence[i]);
        }
        return arr.length - maxLen;
    }

    //task 6
    public static int[][] createMatrix (final int[] arr) {
        int[][] matrix = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = i; j < arr.length; j++) {
                matrix[i][counter] = arr[j];
                counter++;
            }
            for (int j = 0; j < i; j++) {
                matrix[i][counter] = arr[j];
                counter++;
            }
        }
        return matrix;
    }

    //task 7
    public static int[] arrraySort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                array[i] = array[i + 1] ^ array[i];
                array[i + 1] = array[i] ^ array[i + 1];
                array[i] = array[i + 1] ^ array[i];
                i--;
                if (i < 0) {
                    i = 0;
                }
            }
        }
        return array;
    }

    //task 8
    public static ArrayList<Integer> findIndexesToCombineSequences(ArrayList<Integer> firstSequence, ArrayList<Integer> secondSequence) {
        int counter = 0;
        ArrayList<Integer> indexesArray = new ArrayList<>();
        for (int element: secondSequence) {
            boolean isNotInsert = true;
            while (isNotInsert) {
                if (counter > firstSequence.size() - 1 || element <= firstSequence.get(counter)) {
                    indexesArray.add(counter);
                    isNotInsert = false;
                } else {
                    counter++;
                }
            }
        }
        return indexesArray;
    }
}

