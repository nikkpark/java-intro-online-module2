//package ru.hitchin.module2.array;

/*
* Задача 8.
* Дана последовательность целых чисел a1, a2,..., an.
* Образовать новую последовательность, выбросив из исходной те члены,
* которые равны min(a1, a2,..., an).
*/
public class Task08 {
    public static void main(String[] args) {

        task08(new int[] {5, -1, 4, 12, -1, 0});
        task08(new int[] {1, 1, 1, 1});
        task08(new int[] {});
    }

    private static void task08(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Initial array:\n[]");
            System.out.println("Size of array must be natural.");
            System.out.println();
            return;
        }

        int[] newArr;

        printArray(arr, "Initial array:");
        newArr = deminimalize(arr);
        printArray(newArr, "Array without items of minimal value: ");
        System.out.println();
    }

    private static void printArray(int[] arr, String message) {
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

    private static int[] deminimalize(int[] arr) {
        int minimalValue;
        int counter;
        int[] tmp;
        int j;

        minimalValue = arr[0];
        counter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimalValue) {
                minimalValue = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minimalValue) {
                ++counter;
            }
        }

        tmp = new int[arr.length - counter];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minimalValue) {
                tmp[j] = arr[i];
                ++j;
            }
        }

        return tmp;
    }
}