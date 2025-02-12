import java.util.Scanner;

public class duplicateStr {

    public static void duplicateWordInStr(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (str.length() == idx) {
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            duplicateWordInStr(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            duplicateWordInStr(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String duplicate = sc.nextLine();
        duplicateWordInStr(duplicate, 0, new StringBuilder(""), new boolean[26]);
    }
}
