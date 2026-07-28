package arrays;

public class LongestSubarrayWithSumKPositive {
	public static int longestSubArray(int[] nums, int k) {
		int left = 0;
		int sum = 0;
		int maxLength = 0;
		
		for(int right = 0; right < nums.length; right++) {
			sum += nums[right];
			
			while(sum > k) {
				sum -= nums[left];
				left++;
			}
			
			if(sum == k) {
				maxLength = Math.max(maxLength, right - left + 1);
			}
		}
		
		return maxLength;	
	}
	public static void main(String[] args) {
		
		int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int ans = longestSubArray(nums, k);

        System.out.println("Length of Longest Subarray = " + ans);
		
	}		
}
