package daily_que;
import java.util.*;
//https://leetcode.com/problems/design-a-number-container-system?envType=daily-question&envId=2025-02-10

public class eighth_feb {
    private Map<Integer, Integer> d = new HashMap<>();
    private Map<Integer, TreeSet<Integer>> g = new HashMap<>();

    public NumberContainers() {
    }

    public void change(int index, int number) {
        if (d.containsKey(index)) {
            int oldNumber = d.get(index);
            g.get(oldNumber).remove(index);
        }
        d.put(index, number);
        g.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        var ids = g.get(number);
        return ids == null || ids.isEmpty() ? -1 : ids.first();
    }
}
