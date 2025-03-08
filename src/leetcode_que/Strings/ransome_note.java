package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/ransom-note?envType=problem-list-v2&envId=string

public class ransome_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCounts = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            letterCounts[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--letterCounts[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
