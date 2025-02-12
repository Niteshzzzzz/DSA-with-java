import java.util.Scanner;

public class XpowerNoptimal {

    public static int XpNo(int x, int n){
        if (n == 0) {
            return 1;
        }
            int halfPower = XpNo(x, n/2);
            int halfPowersq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(XpNo(x, n));
    }
}
