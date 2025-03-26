
public class binarySearch {

    public static int binary_search(int arr[], int target) {
        
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = end + (start - end)/2;
            if (arr[mid] == target) {
                result = mid;
            
            }
            if (arr[mid] > target || start < end) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,1,2,2,2};
        System.out.println(binary_search(arr, 1));
    }
}
