import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("ARRAY AFTER SORTING:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "  element of sorted array is : " + arr[i]);
        }
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < (arr.length - 1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
