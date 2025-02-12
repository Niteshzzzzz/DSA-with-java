import java.util.Scanner;

public class tilingProblem {

    public static int tilingProb(int n) { // 2*n(size of area) and 2*1(size of a till) 1
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //for vertical
        int vertical = tilingProb(n-1);
        //for horizontal
        int horizontal = tilingProb(n-2);
        // total
        int total = vertical + horizontal;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the till's width:");
        int n = sc.nextInt();
        System.out.println(tilingProb(n));
    }
}
