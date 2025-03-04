package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses

public class min_remove_parentheses {
    public String minRemoveToMakeValid(String s) {
        Deque<Character> que = new ArrayDeque<>();
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' && x == 0) {
                continue;
            }
            if (c == '(') {
                ++x;
            } else if (c == ')') {
                --x;
            }
            que.push(c);
        }
        StringBuilder ans = new StringBuilder();
        x = 0;
        while (!que.isEmpty()) {
            char c = que.pop();
            if (c == '(' && x == 0) {
                continue;
            }
            if (c == ')') {
                ++x;
            } else if (c == '(') {
                --x;
            }
            ans.append(c);
        }
        return ans.reverse().toString();
    }
}
