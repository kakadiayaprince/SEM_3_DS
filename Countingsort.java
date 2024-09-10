package DS;

import java.util.Scanner;

public class Countingsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Enter " + (i+1) + " Element OF Array :");
            arr[i] = sc.nextInt();
        }
        countsort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + " Element OF Array After Sorting :");
            System.out.println(arr[i]);
        }
    }

   static void countsort(int arr[], int n) {

        int[] output = new int[n + 1];

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}