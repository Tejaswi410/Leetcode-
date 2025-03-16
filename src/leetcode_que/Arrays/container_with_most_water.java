package leetcode_que.Arrays;
//https://leetcode.com/problems/container-with-most-water?envType=problem-list-v2&envId=array

public class container_with_most_water {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int ans = 0;
        while (left < right){
            int wd = right - left;    //this is width btwn left and right boundary
            int ht = Math.min(height[left],height[right]); //finding the min height boundary for calculating area
            int area = ht * wd;
            ans = Math.max(ans,area);
            if(height[left] < height[right]) left++;  //this ensures that we get the max boundary and skips small height boundaries
            else right--;
        }
        return ans;
    }
}
