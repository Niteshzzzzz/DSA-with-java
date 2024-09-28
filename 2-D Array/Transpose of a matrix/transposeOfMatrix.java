import java.util.*;

public class transposeOfMatrix {
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

    static int[][] transposeMatrix(int[][] arr, int r, int c) {
        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows: ");
        int r = sc.nextInt();
        System.out.println("Enter no. columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        inputArray(arr);

        int[][] transpose = transposeMatrix(arr, r, c);
        System.out.print("Transpose ");
        printArray(transpose);
    }
}
