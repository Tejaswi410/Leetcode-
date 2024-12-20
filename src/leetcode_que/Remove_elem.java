package leetcode_que;
//https://leetcode.com/problems/remove-element
public class Remove_elem {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }

        return j;

    }
}
