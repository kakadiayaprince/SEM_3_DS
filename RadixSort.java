package DS;

import java.util.Scanner;

public class RadixSort {

    public static void countingSort(int[] array, int place) {
        int size = array.length;
        int[] output = new int[size];
        int[] count = new int[10];

        for (int i = 0; i < size; i++) {
            int index = (array[i] / place) % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            int index = (array[i] / place) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    public static void radixSort(int[] array) {

        int maxElement = getMax(array);

        for (int place = 1; maxElement / place > 0; place *= 10) {
            countingSort(array, place);
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Enter " + (i + 1) + " Element OF Array :");
            arr[i] = sc.nextInt();
        }

        radixSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " Element OF Array After Sorting :");
            System.out.println(arr[i]);
        }

    }
}
