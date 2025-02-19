package leetcode_que.Arrays;
import java.util.*;

public class subarray_equalsK_xor {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarray_xor_k(arr,k));
    }

    public static int subarray_xor_k(int[] arr,int k){
        int cnt=0;
        int xor = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(xor,1);
        int n = arr.length;
        for(int i=0;i<n;i++){
             xor= xor ^ arr[i];
             int x = xor ^ k;

             if(mpp.containsKey(x)){
                 cnt+= mpp.get(x);
             }
             if(mpp.containsKey(xor)){
                 mpp.put(xor,mpp.get(xor) + 1);
             }
             else{
                 mpp.put(xor,1);
             }
        }
        return cnt;
    }
}
