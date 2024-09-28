import java.util.Scanner;

public class ReverseArray {
    static void inputArray(int[] arr){
        Scanner obj = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = obj.nextInt();
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void reversingArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            swaping(arr, i, j);
            i++;
            j--;
        }
    }

    static void swaping(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        printArray(arr);
        reversingArray(arr);
        System.out.println("reversed array is: ");
        printArray(arr);
    }
}
