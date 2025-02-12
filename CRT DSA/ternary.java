public class ternary {
    public static void main(String[] args) {
        int a =4;
        int b =1;
        int c =8;
        int res = (a>b)?((a>c)?a:c):((b>c)?b:c);
        int res2 = ((a>b) && (a>c))? a : (b>a) && (b>c) ? b :c;
        System.out.println(res);
        System.out.println(res2);
    }
}
