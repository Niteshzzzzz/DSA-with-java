import java.util.Scanner;

public class lastOccurance {

    // check last occurance function
    public static int lastOccur(int[] arr, int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccur(arr, key, i - 1);
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
        int result = lastOccur(arr, x, arr.length - 1);
        if (result == -1) {
            System.out.println("Element is not present in the given array.");
        } else {
            System.out.println("Element present at index " + result + " in the given array.");
        }
    }
}
