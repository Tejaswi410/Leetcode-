package leetcode_que.sliding_window;
import java.util.*;
//https://leetcode.com/problems/contains-duplicate-ii?envType=problem-list-v2&envId=sliding-window

public class contains_duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}
