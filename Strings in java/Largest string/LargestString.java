
public class LargestString {

    public static void main(String[] args) {
        String str[] = {"apple", "banana", "mango"};
        String largeString = str[0];
        for(int i = 1; i < str.length; i++) {
            if (largeString.compareTo(str[i]) < 0) {
                largeString = str[i];
            }
        }
        System.out.println(largeString);
    }
}
