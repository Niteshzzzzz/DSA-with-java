import java.util.Scanner;

public class KthLargeElm {

    // taking input in array
    public static void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // findig Kth largest element in the given array
    public static void KthLargestElementFn(int arr[], int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(k + "th largest element is "+ arr[k-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        System.out.println("Enter Kth position: ");
        int k = sc.nextInt();
        KthLargestElementFn(arr, k);
    }
}
