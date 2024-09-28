import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // integer input and output
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Number is: "+a);

        //String input and output
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("String is: "+str);

        //float input and output
        System.out.println("Enter a float no. : ");
        float f = sc.nextFloat();
        System.out.println("Number is: "+f);

        //char input and output
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        //boolean input and output
        System.out.println("Enter a boolean value: ");
        boolean b = sc.nextBoolean();
        System.out.println("Value: "+b);
    }
}
