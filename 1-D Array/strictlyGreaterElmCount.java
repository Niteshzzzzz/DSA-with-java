import java.util.Scanner;

public class strictlyGreaterElmCount {
    static void array(int[] arr){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" Element in Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = obj.nextInt();
        }
    }

    static int Accurence(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        array(arr);
        System.out.print("Enter element: ");
        int x = obj.nextInt();
        System.out.println("No. of elements that are greater than "+x+" is:"+Accurence(arr, x));  
    }
}
