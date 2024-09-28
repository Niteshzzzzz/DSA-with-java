import java.util.Scanner;

public class matrixAddition {
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

    static void addition(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Error: Both matrices must have same order.");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Resultant matrix after addition of two matrices: ");
        printArray(sum);
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

        addition(arr1, arr2, r1, c1, r2, c2);
    }
}
