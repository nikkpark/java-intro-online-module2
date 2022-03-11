package ru.hitchin.module2.array;

/*
* Задача 2.
* Дана последовательность действительных чисел a1, a2,..., an.
* Заменить все ее члены, большие данного Z, этим числом.
* Подсчитать количество замен.
*/
public class Task02 {
    public static void main(String[] args) {
        task02(-10, 3.4);
        task02(6, 2.3);
    }

    public static void task02(int sequenceSize, double threshold) {
        System.out.println("Sequence size: " + sequenceSize);

        if (sequenceSize < 1) {
            System.out.println("Size of sequence must be natural.");
            System.out.println();
            return;
        }

        double[] sequence;

        sequence = generateSequence(sequenceSize);
        printSequence(sequence);
        System.out.println("Threshold: " + threshold);
        countChange(sequence, threshold);
    }

    public static double[] generateSequence(int sequenceSize) {
        /* an = (n + 0.2) */
        double[] sequence = new double[sequenceSize];

        for (int i = 0; i < sequenceSize; i++) {
            double n = i + 1;
            sequence[i] = (n + 0.2) ;
        }

        return sequence;
    }

    public static void printSequence(double[] sequence) {
        System.out.print("[" + sequence[0]);
        for (int i = 1; i < sequence.length - 1; i++) {
            System.out.print(" " + sequence[i]);
        }
        System.out.println("]");
    }

    public static void countChange(double[] sequence, double threshold) {
        int counter;

        counter = 0;

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > threshold) {
                ++counter;
            }
        }

        System.out.println("Changes: " + counter);
    }

}