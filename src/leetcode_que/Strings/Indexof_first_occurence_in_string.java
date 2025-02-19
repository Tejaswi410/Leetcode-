package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string?envType=problem-list-v2&envId=string

public class Indexof_first_occurence_in_string {
    public int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();
        int i = 0, j = 0;
        int ind = 0;
        while(i < h){
            ind = i;
            while(i < h && j < n && (haystack.charAt(i) == needle.charAt(j))){
                i++;
                j++;
            }
            if(j == n) return ind;
            else{
                j = 0;
                i = ind + 1;
            }
        }
        return -1;
    }
}
