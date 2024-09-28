import java.util.Scanner;

public class swap3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Number after swap: a = "+a+", b = "+b);
    }  
}
