import java.util.Scanner;

public class trappingWater {

    // taking input in array
    public static void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int trappedWater(int arr[]){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        right[right.length -1] = arr[arr.length -1];
        int value = 0;
        for (int i = 1; i < arr.length; i++) {
            if (left[i-1] < arr[i]) {
                left[i] = arr[i];
            }else{
                left[i] = left[i-1];
            }
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (right[i+1] < arr[i]) {
                right[i] = arr[i];
            }else{
                right[i] = right[i+1];
            }
        }
        
        for (int i = 0; i < right.length; i++) {
            if (left[i] < right[i]) {
                value += left[i] - arr[i]; 
            }
            else{
                value += right[i] - arr[i];
            }
        }
         return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        int result = trappedWater(arr);
        System.out.println(result);
    } 
}
