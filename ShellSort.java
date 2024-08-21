import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }
        shellsort(arr);
        System.out.println("ARRAY AFTER SORTING:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "  element of sorted array is : " + arr[i]);
        }
    }

    public static void shellsort(int arr[]) {
        for (int gap = arr.length; gap > 0; gap = gap / 2) {
            for (int j = gap; j > arr.length; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = arr[i + gap];
                    }
                }
            }
        }
    }
}
