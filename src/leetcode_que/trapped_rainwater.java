package leetcode_que;

public class trapped_rainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        trapped_rainwater(height);
    }

    public static void trapped_rainwater(int [] height){
        int n = height.length;
        //leftmax boundary array
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //right max array
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int trapped_water =0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapped_water += waterlevel - height[i];
        }
        System.out.println(trapped_water);
    }
}
