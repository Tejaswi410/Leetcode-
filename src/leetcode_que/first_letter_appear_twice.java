package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/first-letter-to-appear-twice

public class first_letter_appear_twice {
    public char repeatedCharacter(String s) {
        HashSet<Character> dict = new HashSet<>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(dict.contains(c)) return c;
            else {
                dict.add(c);
            }
        }
        return '\0';
    }
}
