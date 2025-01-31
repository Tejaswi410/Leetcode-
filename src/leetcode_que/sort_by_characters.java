package leetcode_que;
import java.util.*;
//https://leetcode.com/problems/sort-characters-by-frequency

public class sort_by_characters {

        public String frequencySort(String s) {
            Map<Character,Integer> map = new HashMap<>(52); //creating a hashmap to store the characters and their freq
            for(int i=0;i<s.length();i++){
                map.merge(s.charAt(i),1,Integer :: sum);
            }

            List<Character> list = new ArrayList<>(map.keySet());  //Now creating a arraylist of size keySet of map and sort the list in descending order so that max freq char comes first
            list.sort((a,b) -> map.get(b) - map.get(a));  // this contains a lambda expression this means we have shown that get(b) and get(a) from the map and subtract the values the positive value takes b and negative value takes a so that we get the sorted list in descending order

            StringBuilder sorted = new StringBuilder();  //created a stringbuilder to store the result
            for( char c: list){
                for(int freq = map.get(c); freq > 0; --freq){  //starting from the max freq and appending it to the stringbuilder
                    sorted.append(c);
                }
            }
            return sorted.toString();
        }

}
