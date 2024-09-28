import java.util.Scanner;

public class pyramidNumber {
         public static void main(String[] args) {
        int r;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
       
        for(int i = 1; i <= r; i++){
            for(int l = 1; l <= r-i; l++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = i-1; k >= 1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    } 
}
