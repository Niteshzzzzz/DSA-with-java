
// in this problem we have a array having integer elements and a given number. find two elements of array those sum is equal to the geven number and also print them.
import java.util.Scanner;

public class sum {

    // taking input in array
    public static void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    //finding tow elements of the array those sum is equal to the given number
    public static void sumOfTwoElm(int arr[], int n) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == n) {
                    System.out.print("[" +arr[i]+ ", "+arr[j]+"], ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        System.out.println("Take a number that is sum of two elements of the given array: ");
        int n = sc.nextInt();
        sumOfTwoElm(arr, n);
    }
}