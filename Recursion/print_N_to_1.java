import java.util.Scanner;
public class print_N_to_1 {

    static void print(int n){
        // Base work
        if(n == 1){
            System.out.println(n);
            return;
        }

        // Self work
        System.out.println(n);

        // recursive work
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        print(n);
    }
}
