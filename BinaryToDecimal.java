import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int bin_no = obj.nextInt();
        int ans = 0;
        int power = 1,x;
        while (bin_no > 0) {
            x =bin_no % 10;
            ans +=(power*x);
            power*=2;
            bin_no/=10;
        }
        System.out.println("Decimal no. is: "+ans);
    }
}
