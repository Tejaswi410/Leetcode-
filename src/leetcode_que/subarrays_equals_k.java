package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/subarray-sum-equals-k
//https://leetcode.com/problems/subarray-sum-equals-k/solutions/301242/general-summary-of-what-kind-of-problem-can-cannot-solved-by-two-pointers
public class subarrays_equals_k {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt=0;
        int presum =0;
        Map<Integer,Integer> map = new HashMap<>();//storing integer with its freq ....first integer is for value and second one is for it freq
        map.put(0,1);
        for(int i=0;i<n;i++){
            presum+= nums[i];
            int remove = presum -k;
            cnt += map.getOrDefault(remove,0);//checking if remove or 0 exists or not if it does then increment the cnt
            map.put(presum,map.getOrDefault(presum,0) +1);//inserting the presum and also checking if this presum or 0 already exists or not if it does then we increment the freq for further needs
        }
        return cnt;
    }
}
