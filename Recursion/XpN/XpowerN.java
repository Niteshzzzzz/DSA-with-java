import java.util.Scanner;

public class XpowerN {

    public static int power(int x, int n){
        if (n == 1) {
            return x;
        }
        return (x * power(x, n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
