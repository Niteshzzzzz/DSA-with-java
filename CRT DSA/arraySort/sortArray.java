import java.util.Scanner;

public class sortArray {

    // taking input in array
    public static void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // sorting element of the array
    public static void sortArr(int arr[]){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;  
                }
            }
        }
    }

    // printing array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        sortArr(arr);
        printArray(arr);
    }
}
