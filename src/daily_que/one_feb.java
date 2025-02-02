package daily_que;
import java.util.*;
//https://leetcode.com/problems/special-array-i?envType=daily-question&envId=2025-02-02

public class one_feb {
    public boolean isArraySpecial(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(isEven(nums[i]) == isEven(nums[i-1])){
                return false;
            }
        }
        return true;
    }

    public boolean isEven(int num){
        return num % 2 ==0;
    }
}
