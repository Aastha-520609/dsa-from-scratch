package arrays;

import java.util.Arrays;

public class SortColours {
	public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
               swap(nums, low, mid);
               low++;
               mid++;
            }
            else if(nums[mid] == 1){
               mid++;
            }
            else{
              swap(nums, mid, high);
              high--;
            }
        }
        
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void main(String args[]) {
    	
    	  int[] nums1 = {2, 0, 2, 1, 1, 0};
          sortColors(nums1);
          System.out.println("Test Case 1 (Mixed): " + Arrays.toString(nums1));
          
          int[] nums2 = {0, 0, 1, 1, 2, 2};
          sortColors(nums2);
          System.out.println("Test Case 2 (Already Sorted): " + Arrays.toString(nums2));

          int[] nums3 = {1, 1, 1, 1};
          sortColors(nums3);
          System.out.println("Test Case 3 (All Same): " + Arrays.toString(nums3));
    }

}
