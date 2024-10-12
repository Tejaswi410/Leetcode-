package leetcode_que;



public class pairs_in_array {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        int[] arr = {1,-2,6,-1,3};
       // pairs(nums);
        subarray(nums);
       // maxsubarr(arr);
       //maxsubarray_prefixsum(arr);
        //kadanes(arr);
    }

    public static void pairs(int[] nums){
        int tp=0;
        for(int i= 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.print("(" + nums[i] +"," + nums[j] +") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print(tp);

    }

    public static void subarray(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void maxsubarr(int[] arr){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum =0;
                for(int k=i;k<=j;k++){
                    currsum += arr[k];
                }
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void maxsubarray_prefixsum(int[] arr){
        int currsum  =0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                currsum = i ==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(maxsum < currsum){
                maxsum = currsum;
            }
        }
        System.out.print("Maximum subarray is " + maxsum);

    }

    public static void kadanes(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs +=arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("The maximum subarray is " + ms);
    }


    
}
