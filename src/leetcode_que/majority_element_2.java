package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/majority-element-ii

public class majority_element_2 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = ((int) n / 3);
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        Integer ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;//here Integer is used instead int bcoz we have to use methods on ele1,el2 and methods are not allowed in int.(check line no.47)
        //Handling small arrays
        if(nums.length==0) return ans;
        if(nums.length<3){
            HashSet<Integer> unique = new HashSet<>();
            for(int ele:nums){
                unique.add(ele);
            }
            ans.addAll(unique);
            return ans;
        }
        // Applying the algorithm
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && ele2!=nums[i]) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele1!=nums[i]) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (nums[i] == ele1)
                cnt1++;
            else if (nums[i] == ele2)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        // Verifying the ele1 and ele2
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele1) cnt1++;
            if (nums[i] == ele2) cnt2++;
        }
        if (cnt1 > threshold) ans.add(ele1);
        if (cnt2 > threshold && (!ele2.equals(ele1))) ans.add(ele2);

        return ans;
    }
}
