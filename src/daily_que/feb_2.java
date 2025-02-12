package daily_que;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated?envType=daily-question&envId=2025-02-02

public class feb_2 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[(i+1)]){
                cnt++;
            }
        }
        if(nums[n-1] > nums[0]) cnt++;
        if(cnt <= 1) return true;
        else{
            return false;
        }
    }
}
