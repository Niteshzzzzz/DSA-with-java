import java.util.Scanner;

public class numberTringlePattern {
     public static void main(String[] args) {
        int r,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
