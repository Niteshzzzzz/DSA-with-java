// here we create an another array to reverse the array that is ans[]
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
    static int[] reverseArr(int [] arr) {
        Scanner obj = new Scanner(System.in);
        int[] ans = new int[arr.length];
        int j = arr.length-1;
        for(int i=0; i<arr.length; i++){
            ans[j--] = arr[i];
        }
        return ans;
    }
}
public class reverseArray {
    public static void main(String[] args) {
        arrayInputOutput obj = new arrayInputOutput();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = obj1.nextInt();
        int[] arr = new int[n];
        obj.array(arr);
        obj.printArray(arr);
        int[] arr1 = obj.reverseArr(arr);
        System.out.println("Reverse array is: ");
        obj.printArray(arr1);
    }
}
