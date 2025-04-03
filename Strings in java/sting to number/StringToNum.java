public class StringToNum {

        public static int myAtoi(String s) {
            s = s.trim();
            if (s.length() == 0) {
                return 0;
            }

            long longNum = 0;
            boolean sign = false;
            for (int i = 0; i < s.length(); i++) {
                int ans;
                char x = s.charAt(i);
                if (i == 0 && x == '-') {
                    sign = true;
                    continue;
                }
                if (i == 0 && x == '+') {
                    sign = false;
                    continue;
                }
                if (x >= '0' && x <= '9') {
                    ans = x - '0';
                    longNum = longNum * 10 + ans;
                } else {
                    break;
                }
            }
            System.out.println(longNum);
            if (sign == true) {
                longNum = -longNum;
            }
            System.out.println(sign);
            if (longNum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (longNum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) longNum;
        }

    public static void main(String[] args) {
        String s = "9223372036854775808";
        System.out.println(myAtoi(s));
    }
}