// package quick_sort;

public class Quick_Sort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int pIdx = partition(arr, start, end);
        quickSort(arr, start, pIdx - 1);
        quickSort(arr, pIdx + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        for (int j = start; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 6, 66, 456, 43, -2, 2 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
