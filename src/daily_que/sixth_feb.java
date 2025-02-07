package daily_que;
import java.util.*;
//https://leetcode.com/problems/tuple-with-same-product?envType=daily-question&envId=2025-02-07
public class sixth_feb {
    public int tupleSameProduct(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; ++i)
            for (int j = 0; j < i; ++j) {
                final int prod = nums[i] * nums[j];
                ans += count.getOrDefault(prod, 0) * 8;
                count.merge(prod, 1, Integer::sum);
            }

        return ans;
    }
}
