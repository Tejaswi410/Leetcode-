package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/roman-to-integer?envType=problem-list-v2&envId=string

public class Roman2Integer {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans = map.get(s.charAt(s.length()-1));
        for(int i= s.length() -2; i>=0 ; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans = ans - map.get(s.charAt(i));
            }
            else{
                ans = ans + map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
