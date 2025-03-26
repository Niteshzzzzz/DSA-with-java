import java.util.ArrayList;

public class MeanofArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0;
        int j=0;
        double median;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                arr.add(nums1[i]);
                i++;
            } else {
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i < nums1.length){
            arr.add(nums1[i]);
            i++;
        }
        while(j < nums2.length){
            arr.add(nums2[j]);
            j++;
        }

        System.out.println(arr);

        if(arr.size() % 2 != 0) {
            median = arr.get(arr.size()/2);
        } else {
            int left = arr.get((arr.size()/2) - 1);
            int right = arr.get(arr.size()/2);
            median = (double)(left + right)/2;
        }
        return median;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {3,4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
