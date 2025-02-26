import java.util.Stack;

public class ReverseStr {

    static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (str.length() > idx) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "nitesh";
        String result = reverseString(str);
        System.out.println(result);
    }
}
