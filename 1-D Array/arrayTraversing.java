class array{

    // 1-D array
    static void printarray(){
        int[] arr = new int[5];
        int[] arr1 = {11,2,3,43,4,65,63};
        
        // Using for loop
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        // using forEach loop
        for(int ans: arr1){
            System.out.print(ans+" ");
        }
        System.out.println();

        // using while loop
        int i=0, sum=0;
        while (i < arr1.length) {
            System.out.print(arr1[i]+" ");
            sum += arr1[i];
            i++;
        }
        System.out.println();
        System.out.println("sum = "+sum);

        // Finding largest no. in the array
        int largest = arr1[0];

        for(int k=1; k<arr1.length; k++){
            if (arr1[k]>largest) {
                largest = arr1[k];
            }
            // else{
            //     largest = arr1[k-1];
            // }
        }
        System.out.println("Largest no. = "+largest);
    }

    // 2-D array
    void multiArray(){
        int[][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class arrayTraversing {
    public static void main(String[] args) {
        array obj = new array();
        obj.printarray();
        obj.multiArray();
    }
}
