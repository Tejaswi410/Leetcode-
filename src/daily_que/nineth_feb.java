package daily_que;
import java.util.*;
//https://leetcode.com/problems/count-number-of-bad-pairs?envType=daily-question&envId=2025-02-10counj

public class nineth_feb {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        long goodpair = 0;
        long totalPair = (long) nums.length * (nums.length - 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            goodpair += freqMap.getOrDefault(key, 0);
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        }
        return totalPair - goodpair;
    }
}