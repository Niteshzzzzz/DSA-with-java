import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter range of number: ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                System.out.println(i+" is even number.");
            }
            else{
                System.out.println(i+" is odd number.");
            }
        }
    }
}
