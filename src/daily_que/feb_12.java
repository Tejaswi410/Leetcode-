package daily_que;
import java.util.*;
//https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits?envType=daily-question&envId=2025-02-12

public class feb_12 {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxsum = -1;
        for(int num: nums){
            int digitsum =sum(num);
            if(map.containsKey(digitsum)){
                maxsum = Math.max(maxsum,map.get(digitsum) + num);
                map.put(digitsum,Math.max(map.get(digitsum),num));
            }
            else{
                map.put(digitsum,num);
            }
        }
        return maxsum;
    }

    public int sum(int num){
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
}
