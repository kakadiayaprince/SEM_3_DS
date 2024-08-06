import java.util.Arrays;
import java.util.Scanner;

public class BinarySerach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is :");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array is : " + arr[i]);
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + (result + 1));
    }

    public static int binarySearch(int arr[], int key) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                // for left side
                first = mid + 1;
            } else {
                // for right side
                last = mid - 1;
            }
        }
        return -1;
    }
}