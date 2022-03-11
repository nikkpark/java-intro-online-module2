//package ru.hitchin.module2.array;

/*
* Задача 1.
* В массив А[N] занесены натуральные числа.
* Найти сумму тех элементов, которые кратны данному К.
*/
public class Task01 {
    public static void main(String[] args) {
        task01(-1, 2);
        task01(12, 2);
        task01(13, 3);
    }

    public static void task01(int arraySize, int k) {
        System.out.println("Size of the given array: " + arraySize);

        if (arraySize < 1) {
            System.out.println("Size of array must be natural.");
            System.out.println();
            return;
        }

        int sum;
        int[] arr;
        String nums;

        sum = 0;
        arr = new int[arraySize];
        nums = " ";

        for (int i = 0; i < arraySize; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arraySize; i++) {
            if (arr[i] % (double) k == 0) {
                sum = sum + arr[i];
                nums = nums + arr[i] + " + ";
            }
        }

        System.out.println("Sum of multiples of "
                            + k + ": " + nums.substring(1, nums.length() - 3)
                            + " = " + sum);
    }
}
