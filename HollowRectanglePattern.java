import java.util.Scanner;
public class HollowRectanglePattern {
    public static void main(String[] args) {
        int r,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        r = obj.nextInt();
        System.out.print("Enter no of columns: ");
        c = obj.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
