package leetcode_que.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = in.nextInt();
        int ans = OrderAgnosticBinaryS(arr,target);
        System.out.println("The target element is at " + ans);
    }
    static int OrderAgnosticBinaryS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid= start + (end - start)/2;
            if (arr[mid] == target)
                return mid;
            if(isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
            else{
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }


        }
        return -1;

    }
}
