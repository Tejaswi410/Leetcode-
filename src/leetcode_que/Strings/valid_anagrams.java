package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/valid-anagram?envType=problem-list-v2&envId=string

public class valid_anagrams {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];
        for(int i=0;i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i=0; i< t.length();i++){
            count[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<26;i++){
            if(count[i] != 0) return false;
        }
        return true;
    }
}
