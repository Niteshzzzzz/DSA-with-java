
public class LongestSubPalinStr {
    
        public static String longestPalindrome(String s) {
            StringBuilder currPalinStr = new StringBuilder("");
            StringBuilder palinStr = new StringBuilder("");
    
            for(int i = 0; i < s.length(); i++) {
                int k = i;
                boolean isIt = false;
                int j = s.length() - 1;
    
                while(k <= j) {
                    if(s.charAt(j) == s.charAt(k)) {
                        break;
                    }
                    j--;
                }
    
                int last = j;
    
                while(j > k){
                    if(s.charAt(j) == s.charAt(k)) {
                        k++;
                        j--;
                        isIt = true;
                    } else {
                        isIt = false;
                        break;
                    }
                }
    
                if(isIt == true){
                    for(int m = i; m <= last; m++){
                        currPalinStr.append(s.charAt(m));
                    }
                }

                System.out.println(currPalinStr);
                System.out.println(palinStr);
    
                if(currPalinStr.length() > palinStr.length()){
                    palinStr.setLength(0);
                    palinStr.append(currPalinStr);
                    currPalinStr.setLength(0);
                }else {
                    currPalinStr.setLength(0);
                }
                
            }
            return palinStr.toString();
        }

        public static void main(String[] args) {
            String s = "aacabdkacaa";
            System.out.println(longestPalindrome(s));
        }
    
}
