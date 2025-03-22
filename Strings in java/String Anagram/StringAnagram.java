
public class StringAnagram {

    static boolean checkAnagramStr(String str1, String str2) {
        int freq[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "nikesh";
        String str2 = "nitesh";
        System.out.println(checkAnagramStr(str1, str2));
    }
}
