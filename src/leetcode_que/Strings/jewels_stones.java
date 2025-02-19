package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/jewels-and-stones

public class jewels_stones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        int cnt = 0;
        for(int i=0; i<stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                cnt++;
            }
        }
        return cnt;
    }
}
