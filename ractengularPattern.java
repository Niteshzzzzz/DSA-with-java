import java.util.Scanner;
public class ractengularPattern {
    public static void main(String[] args) {
        int r,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
        System.out.print("Enter no of columns: ");
        c = obj.nextInt();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
