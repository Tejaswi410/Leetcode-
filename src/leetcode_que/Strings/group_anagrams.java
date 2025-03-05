package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/group-anagrams?envType=problem-list-v2&envId=string

public class group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            s = new String(chars);

            if (!mp.containsKey(s)) {
                mp.put(s, res.size());
                res.add(new ArrayList<>());
            }

            res.get(mp.get(s)).add(strs[i]);
        }

        return res;
    }
}

