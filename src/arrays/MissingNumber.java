package arrays;

public class MissingNumber {
	 public static int missingNumber(int[] nums) {

	        int n = nums.length;
	        int xor = 0;

	        for(int i = 0; i <= n; i++){
	           xor = xor ^ i;
	        }

	        for(int num : nums){
	            xor = xor ^ num;
	        }

	        return xor;   
	  }
	 
	 public static void main(String args[]) {
		 
		    int[] nums1 = {3, 0, 1};
	        System.out.println("Missing number: " + missingNumber(nums1));

	        int[] nums2 = {0, 1};
	        System.out.println("Missing number: " + missingNumber(nums2));

	        int[] nums3 = {9,6,4,2,3,5,7,0,1};
	        System.out.println("Missing number: " + missingNumber(nums3));

	        int[] nums4 = {1};
	        System.out.println("Missing number: " + missingNumber(nums4));
	 }

}
