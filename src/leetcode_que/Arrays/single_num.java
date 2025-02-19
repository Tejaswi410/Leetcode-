package leetcode_que.Arrays;
//https://leetcode.com/problems/single-number?envType=problem-list-v2&envId=array
public class single_num {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}
