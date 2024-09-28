import java.util.Scanner;
public class swap4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        a = a*b/a;
        b = b*a/b;

        System.out.println("Number after swap: a = "+a+", b = "+b);
    }  
}
