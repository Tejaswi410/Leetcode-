package leetcode_que.Arrays;
//https://leetcode.com/problems/jump-game?envType=problem-list-v2&envId=array

public class jump_game {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for(int i=0; i<n; i++){
            if(i > reach){
                return false;
            }
            reach = Math.max(reach,i+nums[i]);
            if(reach >= n-1) return true;
        }
        return reach >= n-1;
    }
}
