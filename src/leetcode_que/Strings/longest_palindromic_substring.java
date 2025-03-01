package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/longest-palindromic-substring?envType=problem-list-v2&envId=string

public class longest_palindromic_substring {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String ans = "";

        for(int i=1; i<s.length(); i++){
            //this is for odd length
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()) break;
            }

            String temp = s.substring(low+1,high);
            if(temp.length() > ans.length()){
                ans = temp;
            }

            //this is for even length
            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()) break;
            }

            temp = s.substring(low+1,high);
            if(temp.length() > ans.length()){
                ans = temp;
            }
        }
        return ans;
    }
}
