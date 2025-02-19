package leetcode_que.Arrays;
import java.util.*;
//https://leetcode.com/problems/longest-consecutive-sequence?submissionId=1486268794
public class longest_consecutive_sequence {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }

        for(int ele:set){
            if(!set.contains(ele-1)){
                int count =1;
                int x = ele;
                while(set.contains(x + 1)){
                    count += 1;
                    x = x +1;
                }
                longest = Math.max(count,longest);
            }


        }
        return longest;
    }
}
