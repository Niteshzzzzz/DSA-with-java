// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// You need to solve this problem without utilizing the built-in sort function.

import java.util.Scanner;

public class sort {

    // taking input in array
    public static void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + "0's, 1's, 2's elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // sorting array
    public static void sortArrayFn(int arr[]) {
        int one = 0;
        int zero = 0;
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            } else {
                System.out.println("Please enter only 0's, 1's and 2's elements!");
                return;
            }
            // System.out.println(zero+" "+ one+ " " + two);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else if (i < one+zero) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
    }

    // printing array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        sortArrayFn(arr);
        printArray(arr);
    }
}
