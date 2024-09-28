import java.util.Scanner;

public class LastOfAccurence {
    static void array(int[] arr){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" Element in Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = obj.nextInt();
        }
    }

    static int Accurence(int[] arr, int x){
        int count = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == x) {
                count = i;
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
        System.out.print("Enter element whose you want to find last accurences: ");
        int x = obj.nextInt();
        int result1= Accurence(arr, x);
        if (result1==-1) {
            System.out.println("Element is not present");
        } 
        else{
            System.out.println("Last accurence of "+x+" is: "+result1);
        }
    }
}
