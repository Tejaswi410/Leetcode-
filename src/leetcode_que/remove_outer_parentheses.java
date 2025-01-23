package leetcode_que;
import java.io.*;
//https://leetcode.com/problems/remove-outermost-parentheses

public class remove_outer_parentheses {
    public String removeOuterParentheses(String s) {
        int open = 0;
        int close = 0;
        String result = "";
        int flag = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }
            else if(c == ')'){
                close++;
            }
            if(open == close){
                result += s.substring(flag+1,i);
                flag = i+1;
            }
        }
        return result;
    }
}
