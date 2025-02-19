package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/largest-odd-number-in-string

public class largest_odd_no_in_string {
    public String largestOddNumber(String num) {
        for(int i=num.length() -1; i>=0 ; i--){
            if(num.charAt(i) % 2 !=0){
                String s1 = num.substring(0,i+1);  //returning 0 to i+1 to include the ith index coz the second parameter in substring is exclusive
                return s1;
            }
        }
        return "";
    }
}
