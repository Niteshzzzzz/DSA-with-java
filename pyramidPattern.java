import java.util.Scanner;

public class pyramidPattern {
     public static void main(String[] args) {
        int r,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
       
        for(int i = 0; i < r; i++){
            for(int k = 0; k < r-i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
