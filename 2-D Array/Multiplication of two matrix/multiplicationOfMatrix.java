import java.util.Scanner;

public class multiplicationOfMatrix {

    static void inputArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplication(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {
        if (c1 != r2) {
            System.out.println(
                    "Error: Number of columns in first matrix must be equal to the number of rows in secind matrix.");
            return;
        }
        int[][] multi = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    multi[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        printArray(multi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows in array1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter no. columns in array1: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements in the array1: ");
        inputArray(arr1);
        System.out.println("Enter no. rows in array2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter no. columns in array2: ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements in the array2: ");
        inputArray(arr2);
        System.out.println("multiplication of matrix1 and matrix2 is: ");
        multiplication(arr1, arr2, r1, c1, r2, c2);
    }
}