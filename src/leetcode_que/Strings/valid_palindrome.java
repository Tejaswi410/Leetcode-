package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/valid-palindrome?envType=problem-list-v2&envId=string

public class valid_palindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n == 0) return true;
        int left = 0;
        int right = n -1;
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
