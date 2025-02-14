package daily_que;
import java.util.*;
//https://leetcode.com/problems/product-of-the-last-k-numbers?envType=daily-question&envId=2025-02-14

public class feb_14 {
    class ProductOfNumbers {
        ArrayList<Integer> res = new ArrayList<>();
        public ProductOfNumbers() {
            res.clear();
        }

        public void add(int num) {
            if(num == 0){
                res.clear();
                return;
            }
            int prev = res.size() == 0? 1 : res.get(res.size() - 1);
            res.add(prev * num);
        }

        public int getProduct(int k) {
            int s = res.size();
            if(s<k) return 0;
            else if(s==k) return res.get(s-1);
            else return (res.get(s-1)/res.get(s-1-k));
        }
    }
}
