import java.util.Scanner;
public class sortingOddEvemElm {

    static void inputArray(int[] arr) {
        System.out.println("Enter element in array: ");
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

    static void swaping(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static void sortArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start]%2 != 0 && arr[end]%2 == 0) {
                swaping(arr, start, end);
                start++;
                end--;
            } else if (arr[start]%2 == 0) {
                start++;
            } else if (arr[end]%2 != 0) {
                end--;
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