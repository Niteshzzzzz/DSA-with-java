import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18 && age >= 0) {
            System.out.println("Not adult");
        }
        else if (age >= 18 && age < 60) {
            System.out.println("Adult");
        }
        else if(age < 0){
            System.out.println("Age not in negative");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
}
