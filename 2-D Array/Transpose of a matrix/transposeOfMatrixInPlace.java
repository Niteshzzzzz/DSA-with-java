import java.util.*;
// this transpose method is works on only square matrix


public class transposeOfMatrixInPlace {
    static void inputArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printArray(int[][] arr) {
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrixInplace(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows: ");
        int r = sc.nextInt();
        System.out.println("Enter no. columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        inputArray(arr);

        transposeMatrixInplace(arr, r, c);
        System.out.print("Transpose ");
        printArray(arr);
    }
}
