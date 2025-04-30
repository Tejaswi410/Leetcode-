package leetcode_que.sliding_window;
import java.util.*;
//https://leetcode.com/problems/fruit-into-baskets
//similar approach as max consecutive ones 3 problem
public class fruits_into_baskets {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;
        int right = 0;
        while( right < fruits.length) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
            right++;
        }
        return maxFruits;
    }
}
