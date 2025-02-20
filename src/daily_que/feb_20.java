package daily_que;
import java.util.*;
//https://leetcode.com/problems/find-unique-binary-string?envType=daily-question&envId=2025-02-20

public class feb_20 {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder ans = new StringBuilder("");
        for(int i=0; i<n ; i++){
            char ch = nums[i].charAt(i) == '0'? '1': '0';
            ans.append(ch);
        }
        return ans.toString();
    }
}
