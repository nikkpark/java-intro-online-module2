package ru.hitchin.module2.array;

/*
* Задача 3.
* Дан массив действительных чисел, размерность которого N.
* Подсчитать, сколько в нем отрицательных, положительных
* и нулевых элементов.
*/
public class Task03 {
    public static void main(String[] args) {
        task03(-5);
        task03(2);
        task03(10);
    }


    private static void task03(int arraySize) {
        System.out.println("Array size: " + arraySize);

        if (arraySize < 1) {
            System.out.println("Size of sequence must be natural.");
            System.out.println();
            return;
        }

        double[] dullArray;
        int[] counts;

        dullArray = generateArray(arraySize);
        printArray(dullArray);
        counts = countArrayItems(dullArray);

        System.out.println("Zeroes: " + counts[0]);
        System.out.println("Positives: " + counts[1]);
        System.out.println("Negatives: " + counts[2]);
        System.out.println();
    }

    private static double[] generateArray(int arraySize) {
        double[] arr;

        arr = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
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

    private static int[] countArrayItems(double[] arr) {
        /* counts[0] - zeroes; counts[1] - positives; counts[2] - negatives */
        int[] counts = {0, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ++counts[0];
            } else if (arr[i] > 0) {
                ++counts[1];
            } else {
                ++counts[2];
            }
        }

        return counts;
    }
}