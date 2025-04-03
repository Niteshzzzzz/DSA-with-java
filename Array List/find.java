import java.util.ArrayList;

public class find {

    public static ArrayList<Integer> getIndex(int[] arr, int x) {
        int i = 0;
        int j = arr.length - 1;
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(0, -1);
        arr1.add(1, -1);
        while(i < arr.length){
            if(arr[i] == x) {
                arr1.remove(0);
                arr1.add(0,i);
                break;
            }
            i++;
        }
        while(j >=0){
            if(arr[j] == x) {
                arr1.remove(1);
                arr1.add(1,j);
                break;
            }
            j--;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,3,9};
        System.out.println(getIndex(arr, 5));
    }
}
