package daily_que;
//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray?envType=daily-question&envId=2025-02-03

public class feb_3 {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int increasing = 1;
        int decreasing = 1;
        int longest = 1;
        for(int i=0; i<n-1 ; i++){
            if(nums[i] < nums[i+1]){
                increasing++;
                decreasing = 1;
            }
            else if(nums[i] > nums[i+1]){
                decreasing++;
                increasing = 1;
            }
            else{
                increasing = 1;
                decreasing = 1;
            }
            longest = Math.max(longest,Math.max(increasing,decreasing));
        }
        return longest;
    }
}
