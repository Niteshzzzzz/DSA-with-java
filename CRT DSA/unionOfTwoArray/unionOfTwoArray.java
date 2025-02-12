import java.util.Scanner;

public class unionOfTwoArray {

    // taking input in array
    public static void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int findUnion(int a[], int b[]) {
        // code here
        int total = 0;
        int[] arr = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            arr[i] = a[i];       
        }
        for(int i = 0; i < b.length; i++){
           arr[a.length +i] = b[i];       
        }
        for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i]+ " ");
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        int[] freq = new int[max+1];
        for(int i = 0; i < arr.length; i++){
           freq[arr[i]]++;
        }
        for(int i = 0; i < freq.length; i++){
           if(freq[i] != 0){
               total++;
           }
        }    
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        inputArray(arr1);
        inputArray(arr2);
        int t = findUnion(arr1, arr2);
        System.out.println(t);
    }
}
