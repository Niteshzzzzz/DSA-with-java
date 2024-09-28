import java.util.Scanner;
public class queryBasePrefixSum {
    static void inputArray(int[] arr) {
        System.out.println("Enter element in array: ");
        Scanner obj = new Scanner(System.in);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
    }

    static void printArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void prefixSumArray(int[] arr) {
        for(int i=2; i<arr.length; i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n+1];
        inputArray(arr);
        System.out.println("Array before prefix sum: ");
        printArray(arr);
        prefixSumArray(arr);
        System.out.println("Array after prefix sum: ");
        printArray(arr);
        System.out.println("Enter number of query: ");
        int q = obj.nextInt();
        while (q>0) {
            System.out.println("Enter start and end point: ");
            int s = obj.nextInt();
            int e = obj.nextInt();
            System.out.println("Sum is: "+ (arr[e]-arr[s-1]));
            q--;
        }
    }
}
