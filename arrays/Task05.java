//package ru.hitchin.module2.array;

/*
* Задача 5.
* Даны целые числа а1, а2,..., аn.
* Вывести на печать только те числа, для которых ai > i.
*/

public class Task05 {
    public static void main(String[] args) {
        task05(-10);
        task05(7);
    }

    private static void task05(int arraySize) {
        System.out.println("Array size: " + arraySize);

        if (arraySize < 1) {
            System.out.println("Size of sequence must be natural.");
            System.out.println();
            return;
        }

        int[] wholeNumberArray;

        wholeNumberArray = generateArray(arraySize);
        printArray(wholeNumberArray);
        pickOutandPrint(wholeNumberArray);
    }

        private static int[] generateArray(int arrSize) {
        int[] arr;

        arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            double value = Math.random();
            if (value > 0.6) {
                arr[i] = (int) Math.round(value * 10);
            } else if (value < 0.4) {
                arr[i] = (int) Math.round(-value * 10);
            } else {
                arr[i] = (int) 0;
            }
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("]");
    }

    private static void pickOutandPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > i) {
                System.out.print("Value: " + arr[i]);
                System.out.println("\tPosition: " + i);
            }
        }
    }
}