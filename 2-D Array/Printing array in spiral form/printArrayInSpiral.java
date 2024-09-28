import java.util.Scanner;

public class printArrayInSpiral {
    static void inputArray(int[][] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void arraySpiralform(int arr[][], int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;
        while (totalElements<c*r) {
            // topRow -> leftColum to rightColum
            for(int j=leftCol; j<=rightCol && totalElements<r*c; j++){
                System.out.print(arr[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            // rightColum -> topRow to bottomRow
            for(int i=topRow; i<=bottomRow && totalElements<r*c; i++){
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightColum to leftColum
            for(int j=rightCol; j>=leftCol && totalElements<r*c; j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftColum -> bottomRow to topRow
            for(int i=bottomRow; i>=topRow && totalElements<r*c; i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
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
        arraySpiralform(arr, r, c);
        
    }
}
