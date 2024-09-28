import java.util.Scanner;

public class inputOutput {

    static void inputArray(int[][] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printArray(int[][] arr){
        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
        printArray(arr);
    }
}