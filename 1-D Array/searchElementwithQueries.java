import java.util.Scanner;
public class searchElementwithQueries {
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

    static int[] searchElmtWithQueries(int[] arr){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] arr = new int[n];
        array(arr);
        printArray(arr);
      
        int[] freq = searchElmtWithQueries(arr);
        System.out.println("Enter number of queries: ");
        int query = obj.nextInt();
        while (query>0) {
            System.out.println("Enter no that you want to search: ");
            int q = obj.nextInt();
            if (freq[q]>0) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            query--;
        }
    }
}
