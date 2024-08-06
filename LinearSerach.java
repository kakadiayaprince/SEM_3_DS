
import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "  element of array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int result = linearSearch(arr, n, key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }

    public static int linearSearch(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
