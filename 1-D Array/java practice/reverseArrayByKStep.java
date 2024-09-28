import java.util.Scanner;

public class reverseArrayByKStep {
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

    static int[] reversingArray(int[] arr, int k){
       int[] ans = new int[arr.length];
       k = k%arr.length;
       int j=0;
       for(int i = arr.length-k; i < arr.length; i++){
        ans[j++] = arr[i];
       }
       for(int i = 0; i < arr.length-k; i++){
        ans[j++] = arr[i];
       }
       return ans;
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

        System.out.println("Enter k steps: ");
        int k = obj.nextInt();
        
        System.out.println("reversed array is: ");
        int[] ans = reversingArray(arr,k);
        printArray(ans);

    }
}
