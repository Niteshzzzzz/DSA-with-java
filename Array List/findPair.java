import java.util.ArrayList;

public class findPair {

    public static boolean pair(int arr[], int target) {
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] - arr[j] == target || arr[i] - arr[j] == -target) {
                   
                   return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(pair(arr, 1));
    }
}
