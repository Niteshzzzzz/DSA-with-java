import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int x = sc.nextInt();
        int i=1;
        while (i <= 10) {
            int mul = i*x;
            System.out.println(x+" X "+i+" = "+mul);
            i++;
        }
    }
}
