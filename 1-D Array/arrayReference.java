import java.util.Scanner;

public class arrayReference {

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

    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] arr = new int[n];
        array(arr);
        printArray(arr);
        int[] arr1 = arr;
        printArray(arr1);

        for(int i=0; i<2; i++){
            arr1[i]=0;
        }
        System.out.println("Parent array: ");
        printArray(arr);

        System.out.println("child array: ");
        printArray(arr1);

        int[] arr2 = new int[5];
        //arr2[3]=6;
        printArray(arr2);
    }

}
