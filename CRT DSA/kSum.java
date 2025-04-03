import java.util.Scanner;

public class kSum {

    static int fab(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fab(n - 1) + fab(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end term:");
        int n = sc.nextInt();
        // String s ="";
        // for (int i = 0; i <= n; i++) {
        //     // System.out.print(fab(i) + " ");
        //     s = s + fab(i);
        // }
    
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     System.out.print(s.charAt(i)+", ");
        // }
        int n1 = n;
        while (n1 >= 0) {
            System.out.println(fab(n1));
            n1--;
        }

    }

}
