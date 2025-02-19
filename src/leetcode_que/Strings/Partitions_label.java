package leetcode_que.Strings;
import java.util.*;
//https://leetcode.com/problems/partition-labels
//basic idea is to find the lastindex of ith char and lastindex of (i+1)th char...if lastindex of i+1 exceeds the lastindex of i then the following partitions should exceed to the index of the i+1 and so on.

public class Partitions_label {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitions = new ArrayList<>();  //creating an arraylist to store the start index of partitions

        for(int i=0; i<s.length(); ){
            int firstInd = i;
            int lastInd = s.lastIndexOf(s.charAt(firstInd));  //finding the lastindex of ith char
            for(int j=firstInd + 1; j<lastInd; j++){
                int lastIndexOf_nextChar = s.lastIndexOf(s.charAt(j));  //finding the lastindex of (i+1)th char
                if(lastIndexOf_nextChar > lastInd){
                    lastInd = lastIndexOf_nextChar;
                }
            }
            partitions.add(lastInd - firstInd + 1);
            i = lastInd + 1;
        }
        return partitions;
    }
}
