package leetcode_que.Arrays;
import java.util.*;
//https://leetcode.com/problems/4sum
/*first sort the array then use two pointers approach just like 3sum use 2 variables(i,j) as anchors and k and l as two pointers
k starts from j+1 and l from n-1
*/
public class foursum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);//first sort the array
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i+1 && nums[j] == nums[j - 1])//i and j are two anchors
                    continue;
                int k = j + 1;//left pointer increase when sum < target
                int l = n - 1;//right pointer decrease when sum < target
                while (k < l) {
                    long  sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();// temporary list use to store the elements if found and add it to the ans list
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;//these two loops used if there are multiple same element one by one
                        while(k<l && nums[l]==nums[l+1]) l--;
                    } else if (sum < target)
                        k++;
                    else
                        l--;
                }

            }
        }
        return ans;
    }
}
