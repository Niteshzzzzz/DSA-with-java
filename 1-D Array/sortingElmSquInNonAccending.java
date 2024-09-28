import java.util.Scanner;

// input elements must be in non-decreasing order
public class sortingElmSquInNonAccending {

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

    static void swaping(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static void rotateArray(int[] arr, int i, int j){
        while (i<j) {
            swaping(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] sortArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int[] ans = new int[arr.length];
        int k=0;
        while (start <= end) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                ans[k++] = arr[start]*arr[start];
                start++;
            } else {
                ans[k++] = arr[end]*arr[end];
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        System.out.println("Array before sorting: ");
        printArray(arr);
        int[] ans = sortArray(arr);
        rotateArray(ans, 0, ans.length-1);
        System.out.println("Array after sorting in non-decreasing and square each alements: ");
        printArray(ans);
    }
}