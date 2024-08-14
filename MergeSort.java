import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }

        mergesort(arr, 0, arr.length - 1);
        System.out.println("ARRAY AFTER SORTING:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "  element of sorted array is : " + arr[i]);
        }
    }

    public static void mergesort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int left[] = new int[mid - low + 1];
        int right[] = new int[high - mid];

        // for the left side array

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        // for the right side array

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
