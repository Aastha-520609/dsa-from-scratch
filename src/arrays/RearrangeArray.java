package arrays;

import java.util.Arrays;

public class RearrangeArray {
	public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int newArray[] = new int[n];
        
        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int i = 0 ; i < nums.length; i++){
        	
          if(nums[i] > 0){
            newArray[positiveIndex] = nums[i];
            positiveIndex = positiveIndex + 2;
          }
          else if(nums[i] < 0){
            newArray[negativeIndex] = nums[i];
            negativeIndex = negativeIndex + 2;
          }
          
        }

        return newArray;
    }
	
	public static void main(String args[]) {
		
		int[] nums1 = {3, 1, -2, -5, 2, -4};
        System.out.println("Array is: " + Arrays.toString(rearrangeArray(nums1)));

        int[] nums2 = {-1, 1};
        System.out.println("Array is: " + Arrays.toString(rearrangeArray(nums2)));
		
	}

}
