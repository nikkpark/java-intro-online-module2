//package ru.hitchin.module2.array;

import java.util.Arrays;

/*
* Задача 6.
* Задана последовательность N вещественных чисел.
* Вычислить сумму чисел, порядовые номера которых
* являются простыми числами.
*/

public class Task06 {
    public static void main(String[] args) {
        task06(0);
        task06(1);
        task06(10);
    }

    private static void task06(int sequenceSize) {
        System.out.println("Sequence size: " + sequenceSize);

        if (sequenceSize < 1) {
            System.out.println("Size of sequence must be natural.");
            System.out.println();
            return;
        }

        double[] awesomeArray;
        double[] awesomePrimeArray;
        double sum;

        awesomeArray = generateArray(sequenceSize);
        printArray(awesomeArray, "Initial array:");
        awesomePrimeArray = getPrimePositionItems(awesomeArray);
        printArray(awesomePrimeArray, "Items with prime number positions:");

        sum = sumUpItems(awesomePrimeArray);

        System.out.println("Sum = " + sum);
        System.out.println();
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

    private static void printArray(double[] arr, String message) {
        if(arr.length == 0) {
            System.out.println("No items.");
            return;
        }

        System.out.println(message);
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("]");
    }

    private static double[] getPrimePositionItems(double[] arr) {
        double[] tmp;
        int j;

        tmp = new double[0];
        j = 0;

        for(int i = 1; i < arr.length; i++) {
            if ((i == 1 || i == 2 || i == 4 || i == 6)
                || (i % 2 != 0 & i % 3 != 0 & i % 5 != 0 & i % 7 != 0)) {
                tmp = Arrays.copyOf(tmp, tmp.length + 1);
                tmp[j] = arr[i];
                j++;
            }
        }

        return tmp;
    }

    private static double sumUpItems(double[] arr) {
        double sum;

        sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}