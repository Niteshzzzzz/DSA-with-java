import java.util.Scanner;

public class checkSortedArray {
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = isSorted(arr, 0);
        if (result) {
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
        // result ? System.out.println("Array is sorted.") : System.out.println("Array is not sorted.");

    }
}
