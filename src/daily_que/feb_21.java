package daily_que;
import java.util.*;
//https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree?envType=daily-question&envId=2025-02-21

public class feb_21 {
    HashSet<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        dfs(root,0);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public void dfs(TreeNode root,int val){
        if(root == null) return;
        root.val = val;
        set.add(val);
        dfs(root.left,2*val + 1);
        dfs(root.right,2*val + 2);
    }
}
