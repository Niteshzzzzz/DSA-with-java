import java.util.Scanner;

public class fibonacci {

    static int fab(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fab(n-1) + fab(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end term:");
        int n = sc.nextInt();
        if(n<1) System.out.println("Invalid number, please enter a positive number.");

        else{
            for(int i = 0; i <= n; i++){
                System.out.print(fab(i)+" ");
            }  
        }         
    }
}
