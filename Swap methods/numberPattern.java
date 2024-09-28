import java.util.Scanner;

public class numberPattern {
     public static void main(String[] args) {
        int r,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
        System.out.print("Enter no of columns: ");
        c = obj.nextInt();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if((i+j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(2);
            }
            System.out.println();
        }
    }
}
