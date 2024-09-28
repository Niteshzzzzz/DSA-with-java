import java.util.Scanner;
public class rotateArrayByKstep1 {
    
    public static void array(int[] arr){
        System.out.println("Enter "+arr.length+" Element in Array: ");
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = obj.nextInt();
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArr(int [] arr, int i, int j) {
        while (i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotateArrayByKstepInplace(int[] arr,int k) {
        int n = arr.length;
        reverseArr(arr, 0, n-k-1);
        reverseArr(arr, n-k, n-1);
        reverseArr(arr, 0, n-1);
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = obj1.nextInt();
        int[] arr = new int[n];
        array(arr);
        printArray(arr);
        System.out.println("Enter no of steps: ");
        int k = obj1.nextInt();
        System.out.println("Reverse array is: ");
        rotateArrayByKstepInplace(arr, k);
    }
}
