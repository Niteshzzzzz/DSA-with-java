// rotate the g

import java.util.Scanner;

public class rotateArrayByKstep {
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

    static int[] rotateArrayKstep(int[] arr, int k) {
        k = k%arr.length;
        int[] ans = new int[arr.length];
        int j=0;
        for(int i=arr.length-k; i<arr.length; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<arr.length-k; i++){
            ans[j++] = arr[i];
        }
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
        System.out.println("Enter no of stap: ");
        int k = obj.nextInt();
        int[] ans = rotateArrayKstep(arr, k);
        printArray(ans);
    }
}
