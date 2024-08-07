import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("ARRAY AFTER SORTING:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "  element of sorted array is : " + arr[i]);
        }
    }

    public static void bubbleSort(int arr[]) {
        // variable last for control main loop.
        int Last = arr.length - 1;
        for (int i = 0; i < Last; i++) {
            // variable counter for break while array is sorted.
            int counter = 0;
            for (int j = 0; j < Last - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                }
            }
            if (counter == 0) {
                break;

            } else {
                Last--;
            }
        }
    }
}
