import java.util.Scanner;

public class inverseTriangle {
     public static void main(String[] args) {
        int r,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
       
        for(int i = r; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
