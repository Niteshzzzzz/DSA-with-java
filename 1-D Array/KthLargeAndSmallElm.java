import java.util.Arrays;
import java.util.Scanner;

public class KthLargeAndSmallElm {
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

    static int[] KthLargeSmallElm(int[] arr,int k){
        Arrays.sort(arr);
        int ans[] = {arr[k-1],arr[arr.length-k]};
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
        System.out.println("Enter Kth postion: ");
        int k = obj.nextInt();
        int[] ans = KthLargeSmallElm(arr, k);
        System.out.println(k+"th"+" Smallest element: "+ans[0]);
        System.out.println(k+"th"+" Largest element: "+ans[ans.length-1]);
    }
}
