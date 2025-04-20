package leetcode_que.Strings;
//https://leetcode.com/problems/string-to-integer-atoi

public class atoi {
    public int myAtoi(String s) {
        s = s.trim();    //for removing the whitespaces
        int n = s.length();
        if (n == 0)
            return 0;

        long num = 0;
        int i = 0;
        int sign = 1;

        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {   //to get the sign(+ or -)
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {      //extracting digits from the string
            int digit = s.charAt(i) - '0';
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }

        return (int) (sign * num);
    }
}
