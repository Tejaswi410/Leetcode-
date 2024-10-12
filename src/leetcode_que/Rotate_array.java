package leetcode_que;
import java.util.Scanner;

//https://leetcode.com/problems/rotate-array/description/
public class Rotate_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the elements of array of size 5: ");
       // int n = in.nextInt();
        int[] arr = {1,3,4,5,6};
       // for (int i= 0; i<n;i++){
       //     arr[i] = in.nextInt();
       // }
       // System.out.println("Enter the no. of times you want to rotate the array: ");
        //int k = in.nextInt();
    //   System.out.println("Enter the index for swapping: ");
   //     int index1 = in.nextInt();
     //   int index2 = in.nextInt();
       // swap( arr, index1,index2 );
 //       System.out.println(Arrays.toString(arr));
       // rotate_array(arr,k);
        //System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr,int start,int end){

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void rotate_array(int[] arr,int k){
        //here we are rotating the array by k times like we are shifting the positions of the array elements by k times
        int n = arr.length;
        k = k % n;
        //In first step we will reverse the whole array from index 0 to n-1
        reverse(arr,0,n-1);

        //In second step, we will  reverse the array from index 0 to k-1
        reverse(arr,0,k-1);

        // In third step , we will reverse the array from index k to n-1
         reverse(arr,k,n-1);
    }
}


