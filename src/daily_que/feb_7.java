package daily_que;
import java.util.*;
//https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls?envType=daily-question&envId=2025-02-07find

public class feb_7 {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer> group = new HashMap<>();
        Map<Integer,Integer> cnt = new HashMap<>();
        int n = queries.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            cnt.merge(color,1,Integer :: sum);
            if(group.containsKey(ball) && cnt.merge(group.get(ball),-1,Integer :: sum) == 0){
                cnt.remove(group.get(ball));
            }
            group.put(ball,color);
            ans[i] = cnt.size();
        }
        return ans;

    }
}
