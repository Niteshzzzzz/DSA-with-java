import java.util.Scanner;

public class equalValueArrayDivide {
    static void inputArray(int[] arr) {
        System.out.println("Enter element in array: ");
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSumArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i=1; i<arr.length; i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
        arr2[0]=arr[arr.length-1];
        for(int i=1; i<arr.length; i++)
        {
            arr2[i] = arr[arr.length-1]-arr[i-1];
        }
        return arr2;
    }

    static int isEqualValueDivision(int[] arr, int[] arr2){
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] == arr2[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        System.out.println("Array before prefix sum: ");
        printArray(arr);
        int[] arr2 = prefixSumArray(arr);
        System.out.println("Array after prefix sum: ");
        printArray(arr);
        printArray(arr2);
        int x =isEqualValueDivision(arr, arr2);
        String y = (x == -1)?"Not possible":"for value of "+x+" array is divide into two equal value part.";
        System.out.println(y);
    }
}
