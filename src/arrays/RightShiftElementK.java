package arrays;

import java.util.Arrays;

public class RightShiftElementK {
	 public static void reverse(int[] nums, int start, int end){
	        while(start < end){
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        } 
	    }
	 
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        rotate(arr1, 2);
        System.out.println("Normal case: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        rotate(arr2, 12);
        System.out.println("k > length: " + Arrays.toString(arr2));

        int[] arr3 = {10};
        rotate(arr3, 3);
        System.out.println("Single element: " + Arrays.toString(arr3));
    }
}
