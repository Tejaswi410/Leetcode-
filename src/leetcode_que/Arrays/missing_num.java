package leetcode_que.Arrays;
//https://leetcode.com/problems/missing-number
public class missing_num {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += nums[i];
        }
        int miss_num = sum1 - sum2;
        return miss_num;

    }

    public static int another_approach(int[] nums){
            int xor1=0,xor2=0;
            int n= nums.length;
            for(int i=0;i<n;i++){
                xor2 =xor2 ^ nums[i];
                xor1 =xor1 ^ i;
            }
            xor1 = xor1 ^ n;
            return xor1 ^ xor2;
    }
}
