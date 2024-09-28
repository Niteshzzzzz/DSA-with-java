import java.util.Arrays;
import java.util.Scanner;

public class smallAndLargeNo {
    static void array(int[] arr){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" Element in Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = obj.nextInt();
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] LandS(int[] arr){
        Arrays.sort(arr);
        int ans[] = {arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] arr = new int[n];
        array(arr);
        printArray(arr);
        int[] arr1 = LandS(arr);
        System.out.println("Smallest element: "+arr1[0]);
        System.out.println("Largest element: "+arr1[arr1.length-1]);
    }
}
