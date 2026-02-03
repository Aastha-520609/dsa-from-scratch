package arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
	
	public static int longestSubarray(int[] arr, int k) {
	        
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	        int maxLen = 0;
	        int prefixSum = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            prefixSum += arr[i];
	            
	            if(prefixSum == k){
	                maxLen = i + 1;
	            }
	            
	            if(hmap.containsKey(prefixSum - k)){
	                int len = i - hmap.get(prefixSum - k);
	                maxLen = Math.max(maxLen , len);
	            }
	            
	            hmap.putIfAbsent(prefixSum, i);
	        }
	        
	        return maxLen;
	    }
	
	public static void main(String args[]) {
		int[] nums1 = {1, -1, 5, -2, 3};
	    int k1 = 3;
	    System.out.println(longestSubarray(nums1, k1));

	    int[] nums2 = {2, 3, -2, 4, -4, 6};
	    int k2 = 6;
	    System.out.println(longestSubarray(nums2, k2));

	    int[] nums3 = {1, 2, 3, 4};
	    int k3 = 20;
	    System.out.println(longestSubarray(nums3, k3));
	}
}
