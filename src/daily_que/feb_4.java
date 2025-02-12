package daily_que;
//leetcode.com/problems/maximum-ascending-subarray-sum?envType=daily-question&envId=2025-02-04

public class feb_4 {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        for(int i=0 ; i<n ; i++){
            if(i==0 || nums[i] > nums[i-1]){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
