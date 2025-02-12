// WAP to reverse an array
import java.util.Scanner;

public class reverseArray {

    // taking input in array
    public static void inputArray(int arr[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // revesing array
    public static void reverseArrayFn(int arr[]){
        int p = 0;
        int q = arr.length - 1;
        while (p < q) {
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
    }

    // printing array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        reverseArrayFn(arr);
        printArray(arr);
    }
}
