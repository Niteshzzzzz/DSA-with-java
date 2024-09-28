import java.util.Scanner;

public class UniqueElement {
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

    static int[] isUniqueelm (int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i]=arr[j]=-1;
                }
                else{
                    count++;
                }
            }
        }
        int[] arr1 = new int[count];
        for(int i=0; i<arr.length; i++){
            if (arr[i] != -1) {
                arr1[i] = arr[i];
            }
            
        }
        return arr1;    
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] arr = new int[n];
        array(arr);
        printArray(arr);
        int[] arr1 = isUniqueelm(arr);
        System.out.println("Unique Elements are: ");
        printArray(arr1);
    }
}

