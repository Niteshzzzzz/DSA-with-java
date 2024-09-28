import java.util.Arrays;
import java.util.Scanner;

class isArrayAscending {
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

    static boolean IsAscending(int[] arr){
        boolean ans = true;
        for(int i=1; i<arr.length; i++){
            if (arr[i] < arr[i-1]) {
                ans = false;
            }
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
        System.out.println("array's elements are in ascending order: "+IsAscending(arr));
       
    }
}