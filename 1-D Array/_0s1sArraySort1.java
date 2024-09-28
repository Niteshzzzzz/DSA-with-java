import java.util.Scanner;

//You must take input only 1 and 0

public class _0s1sArraySort1 {
    static void inputArray(int[] arr) {
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortArray(int[] arr) {
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        System.out.println("Array before sorting: ");
        printArray(arr);
        sortArray(arr);
        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
