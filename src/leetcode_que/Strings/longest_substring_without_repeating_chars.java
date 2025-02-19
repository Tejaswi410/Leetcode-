package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/longest-substring-without-repeating-characters?envType=problem-list-v2&envId=string

public class longest_substring_without_repeating_chars {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int cnt = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for(int i=0; i<n; i++){
            char curr = s.charAt(i);
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
                cnt--;
            }
            set.add(curr);
            cnt++;
            max = Math.max(cnt,max);
        }
        return max;
    }
}
