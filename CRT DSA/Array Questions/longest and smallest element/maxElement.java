import java.util.Scanner;

public class maxElement {

    // taking input in array
    public static void inputArray(int arr[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // function for finding maximum element from the given array
    public static void maxMinElementFn(int arr[]) {
        int max_elm = arr[0];
        int min_elm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max_elm < arr[i]) {
                max_elm = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (min_elm > arr[i]) {
                min_elm = arr[i];
            }
        }
        System.out.println("Maximum element is " + max_elm);
        System.out.println("Minimum element is " + min_elm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        maxMinElementFn(arr);
    }
}
