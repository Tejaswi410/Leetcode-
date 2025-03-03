package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/integer-to-roman

public class integer2roman {
    public String intToRoman(int num) {
        List<String> roman  = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> number = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        StringBuilder ans = new StringBuilder();
        int n = roman.size();
        for (int i = 0; i < n; ++i) {
            while (num >= number.get(i)) {
                num -= number.get(i);
                ans.append(roman.get(i));
            }
        }
        return ans.toString();
    }
}
