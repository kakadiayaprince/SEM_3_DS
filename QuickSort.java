import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, arr.length - 1);
        System.out.println("ARRAY AFTER SORTING:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "  element of sorted array is : " + arr[i]);
        }
    }

    public static void quicksort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int i = lb;
            int j = ub;
            int temp;
            int key = arr[lb];
            while (i <= j) {
                while (arr[i] <= key) {
                    i++;
                }
                while (arr[j] > key) {
                    j--;
                }
                if (i <= j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            temp = arr[lb];
            arr[lb] = arr[j];
            arr[j] = temp;

            quicksort(arr, lb, j - 1);
            quicksort(arr, j + 1, ub);
        }
    }
}
