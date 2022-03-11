//package ru.hitchin.module2.array;

/*
* Задача 4.
* Даны действительные числа а1, а2,..., аn.
* Поменять местами найбольший и наименьший элементы.
*/

public class Task04 {
    public static void main(String[] args) {
        task04(-10);
        task04(7);
    }

    private static void task04(int arraySize) {
        System.out.println("Array size: " + arraySize);

        if (arraySize < 1) {
            System.out.println("Size of sequence must be natural.");
            System.out.println();
            return;
        }

        double[] epicArray;

        epicArray = generateArray(arraySize);
        printArray(epicArray);
        epicArray = switchItemsInArray(epicArray);
        printArray(epicArray);
    }

        private static double[] generateArray(int arrSize) {
        double[] arr;

        arr = new double[arrSize];

        for (int i = 0; i < arrSize; i++) {
            double value = Math.random();
            if (value > 0.6) {
                arr[i] = value;
            } else if (value < 0.4) {
                arr[i] = -value;
            } else {
                arr[i] = 0;
            }
        }

        return arr;
    }

    private static void printArray(double[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("]");
    }

    private static double[] switchItemsInArray(double[] arr) {
        double minimalValue;
        double maximalValue;
        int minimalValuePosition;
        int maximalValuePosition;

        /* looking for a minimal value */
        minimalValue = arr[0];
        minimalValuePosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimalValue) {
                minimalValue = arr[i];
                minimalValuePosition = i;
            }
        }

        /* looking for a maximal value */
        maximalValue = arr[0];
        maximalValuePosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximalValue) {
                maximalValue = arr[i];
                maximalValuePosition = i;
            }
        }

        /* switching items */
        arr[minimalValuePosition] = maximalValue;
        arr[maximalValuePosition] = minimalValue;

        return arr;
    }
}