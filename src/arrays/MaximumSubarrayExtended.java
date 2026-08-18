package arrays;

public class MaximumSubarrayExtended {
	
	public static void maxSubArray(int[] nums) {
		
		int maxSum = nums[0];
		int currentSum = nums[0];
		
		int start = 0;
		int bestStart = 0;
		int bestEnd = 0;
		
	   for(int i = 1; i < nums.length; i++) {
		   
		   if(currentSum + nums[i] < nums[i]) {
			   currentSum = nums[i];
			   start = i;
		   }else {
			   currentSum += nums[i];
		   }
		   
		   if(currentSum > maxSum) {
			   maxSum = currentSum;
			   bestStart = start;
			   bestEnd = i;
		   }
	   }
		
		System.out.println("Maximum Sum = " + maxSum);
        System.out.print("Subarray = ");
        
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println();
		
	}
	
	public static void main(String args[]) {
		
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
		
	}

}
