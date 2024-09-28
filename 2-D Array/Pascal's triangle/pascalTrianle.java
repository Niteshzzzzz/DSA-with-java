import java.util.Scanner;

public class pascalTrianle {

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] pascalTrianleArray(int n){
        int[][] arr = new int[n][];
        for(int i = 0; i < n; i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for(int j = 1; j < i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows: ");
        int r = sc.nextInt();
        int[][] ans = pascalTrianleArray(r);
        System.out.println("pascal's triangle is: ");
        printArray(ans);
    }
}
