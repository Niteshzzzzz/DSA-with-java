import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = sc.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("It's not a holiday.");
                break;
            case "Sunday":
                System.out.println("It's a holiday.");
                break;
            default:
                System.out.println("Please Enter Sundey or Monday.");
                break;
        }
    }
}
