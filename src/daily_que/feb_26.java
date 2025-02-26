package daily_que;
import java.util.*;
//https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray?envType=daily-question&envId=2025-02-26

public class feb_26 {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int currPsum = 0;
        int currNsum = 0;
        for(int num: nums){
            currPsum += num;
            maxsum = Math.max(currPsum,maxsum);
            if(currPsum < 0){
                currPsum = 0;
            }
            currNsum += num;
            minsum = Math.min(currNsum,minsum);
            if(currNsum > 0){
                currNsum = 0;
            }
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
