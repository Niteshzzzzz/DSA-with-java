import java.util.Scanner;

public class numericRectaglePattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
        for(int i = 1; i<=r; i++){
            for(int j=i; j<=r; j++){
                System.out.print(j);
            }
            for(int k=1; k<=i-1; k++){
                System.out.print(k);
            } 
            System.out.println();
        }
    }
}
