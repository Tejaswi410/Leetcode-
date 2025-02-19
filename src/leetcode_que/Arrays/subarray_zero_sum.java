package leetcode_que.Arrays;
import java.util.*;


public class subarray_zero_sum {
    public static void main(String[] args) {
      int[] arr = {1, 2, -2, 4, -4};
      subarray_zero_sum(arr);
    }

    public static int subarray_zero_sum(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= arr[i];
            if(sum==0){
                max= i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    max=Math.max(max,i - mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return max;
    }
}
