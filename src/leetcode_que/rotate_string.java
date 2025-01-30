package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/rotate-string

public class rotate_string {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String temp = s + s;
        if(temp.contains(goal)){
            return true;
        }
        return false;
    }
}
