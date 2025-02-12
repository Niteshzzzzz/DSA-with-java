import java.util.Scanner;

public class firstOccurance {

    // check first occurance function
    public static int firstOccur(int[] arr, int x, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == x) {
            return i;
        }
        return firstOccur(arr, x, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array.");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to know first position:");
        int x = sc.nextInt();
        int result = firstOccur(arr, x, 0);
        if (result == -1) {
            System.out.println("Element is not present in the given array.");
        } else {
            System.out.println("Element present at index " + result + " in the given array.");
        }
    }
}
