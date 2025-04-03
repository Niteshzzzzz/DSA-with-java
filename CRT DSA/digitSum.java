public class digitSum {
    public static void main(String[] args) {
        int n = 123;
        int n1 = n%10; 
        n = n/10;
        int n2 = n % 10;
        n = n /10;
        int n3 = n % 10;
        System.out.println(n1+n2+n3);
    }
}
