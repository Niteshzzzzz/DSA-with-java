import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n < 1)
            System.out.println("Invalid number, please enter a positive number.");
        else
            System.out.println(fact(n));
    }
}
