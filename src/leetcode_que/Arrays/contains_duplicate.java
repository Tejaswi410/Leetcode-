package leetcode_que.Arrays;
import java.util.*;
//https://leetcode.com/problems/contains-duplicate?envType=problem-list-v2&envId=array

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
