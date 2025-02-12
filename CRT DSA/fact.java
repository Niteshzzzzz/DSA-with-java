import java.util.Scanner;

public class fact {

    //calculating factorial
    public static void fn(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt();
        fn(n);
    }
}
