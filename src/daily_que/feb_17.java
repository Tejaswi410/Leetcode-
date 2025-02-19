package daily_que;
import java.util.*;
//https://leetcode.com/problems/letter-tile-possibilities?envType=daily-question&envId=2025-02-19

public class feb_17 {
    public static void backtrack(String tiles,String output,HashSet<String> set, Boolean visited[]){
        if(output.length()>0)
        {
            if(set.contains(output))
                return;
            set.add(output);
        }
        for(int i=0;i<tiles.length();i++)
        {
            if(visited[i]) continue;
            visited[i] = true;
            backtrack(tiles,output+tiles.charAt(i),set,visited);
            visited[i] = false;
        }
        return;
    }
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<String>();
        Boolean visited[] = new Boolean[tiles.length()];
        Arrays.fill(visited, Boolean.FALSE);
        backtrack(tiles,"",set, visited);
        return set.size();
    }
}
