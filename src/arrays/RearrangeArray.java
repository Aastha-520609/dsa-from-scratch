package arrays;

import java.util.Arrays;

public class RearrangeArray {
	public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int pIndex = 0;
        int nIndex = 1;

        for(int num : nums){
            if(num > 0){
                result[pIndex] = num;
                pIndex += 2;
            }
            else if(num < 0){
                result[nIndex] = num;
                nIndex += 2;
            }
        }

        return result;
    }
	
	public static void main(String args[]) {
		
		int[] nums1 = {3, 1, -2, -5, 2, -4};
        System.out.println("Array is: " + Arrays.toString(rearrangeArray(nums1)));

        int[] nums2 = {-1, 1};
        System.out.println("Array is: " + Arrays.toString(rearrangeArray(nums2)));
		
	}

}
