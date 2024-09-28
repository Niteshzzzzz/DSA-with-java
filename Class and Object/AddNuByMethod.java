import java.util.Scanner;

class add{
    static int sum(int x, int y){
        return x+y;
    }
}

public class AddNuByMethod {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two no. : ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        add obj1 = new add();
        int y = obj1.sum(a, b);
        System.out.println("sum = "+y);
    }
    
}
