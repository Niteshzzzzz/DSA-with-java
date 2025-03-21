
public class Substing {

    static String findSubstring(String str, int start, int end) {
        String subString = "";
        for (int i = start; i < end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
   
    public static void main(String[] args) {
        String str = "NiteshKumar";
        // System.out.println(findSubstring(str, 0, 7));
        System.out.println(str.substring(0,6));
    }
}
