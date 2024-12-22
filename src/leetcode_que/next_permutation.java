package leetcode_que;
//https://leetcode.com/problems/next-permutation

public class next_permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Arrays.sort(nums);
            System.out.print(Arrays.toString(nums));
        } else {
            for (int i = n - 1; i >= ind; i--) {
                if (nums[i] > nums[ind]) {
                    swap(i, ind, nums);
                    break;
                }
            }

            reverseSubArray(nums, ind + 1, n - 1);
        }
        System.out.print(Arrays.toString(nums));
    }

    public static void swap(int x, int y, int[] nums) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void reverseSubArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
