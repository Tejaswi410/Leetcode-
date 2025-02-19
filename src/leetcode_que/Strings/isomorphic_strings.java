package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/isomorphic-strings

public class isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Character> charMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char og = s.charAt(i);
            char replace = t.charAt(i);

            if(!charMap.containsKey(og)){
                if(!charMap.containsValue(replace)){
                    charMap.put(og,replace);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedChar = charMap.get(og);
                if(mappedChar != replace){
                    return false;
                }
            }
        }
        return true;
    }
}
