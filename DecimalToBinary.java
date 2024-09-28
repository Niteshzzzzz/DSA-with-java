import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a decimal no. : ");
        int dec_no = obj.nextInt();
        int power = 1, x;
        int ans = 0;
        while (dec_no > 0) {
            x = dec_no % 2;
            ans += (power * x);
            power *= 10;
            dec_no /= 2;
        }
        System.out.println("Binary no. is: "+ans);
    }
}
