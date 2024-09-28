import java.util.Scanner;

class arrayInputOutput {
    
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
    static void reverseArr(int [] arr) {
        int i=0, j = arr.length-1;
        while (i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
public class reverseArray1 {
    public static void main(String[] args) {
        arrayInputOutput obj = new arrayInputOutput();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = obj1.nextInt();
        int[] arr = new int[n];
        obj.array(arr);
        obj.printArray(arr);
        obj.reverseArr(arr);
        System.out.println("Reverse array is: ");
        obj.printArray(arr);
    }
}
