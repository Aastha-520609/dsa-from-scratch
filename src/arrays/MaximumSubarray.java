package arrays;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
        	
        	/*
             * At each index, we have two choices:
             * 1. Start a new subarray from nums[i]
             * 2. Extend the previous subarray by adding nums[i]
             *
             * We take the better of the two, so currentSum always represents
             * the maximum subarray sum ending at index i.
             */
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            /*
             * maxSum keeps track of the maximum subarray sum seen so far.
             * If the current subarray (currentSum) is better than the previous
             * maximum, we update maxSum.
             */
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
	
	public static void main(String args[]) {
		
		// Case 1: Mix of positive and negative numbers
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum (Case 1): " + maxSubArray(nums1));
        // Expected Output: 6

        // Case 2: All negative numbers
        int[] nums2 = {-8, -3, -6, -2, -5, -4};
        System.out.println("Max Subarray Sum (Case 2): " + maxSubArray(nums2));
        // Expected Output: -2

        // Case 3: All positive numbers
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Max Subarray Sum (Case 3): " + maxSubArray(nums3));
        // Expected Output: 15
		
	}

}
