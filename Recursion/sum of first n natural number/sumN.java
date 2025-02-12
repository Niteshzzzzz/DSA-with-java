import java.util.Scanner;;

public class sumN {

    public static int sumOfNno(int n){
        if (n == 1) {
            return 1;
        }

        return (n + sumOfNno(n -1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last term: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a natural number!");
        } else{
            System.out.println(sumOfNno(n));
        }
    }
}
