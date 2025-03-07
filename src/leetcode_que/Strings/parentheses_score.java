package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/score-of-parentheses
public class parentheses_score {
    public int scoreOfParentheses(String s) {
        int ans = 0, d = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                d++;
            } else {
                d--;
                if (s.charAt(i - 1) == '(') {
                    ans += 1 << d;    //this is left shift operator .this shift 1 by d places this means it does 2 raised to d and add it to ans.
                }
            }
        }
        return ans;
    }
}
