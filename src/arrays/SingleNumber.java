package arrays;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
	       int xor = 0;
	       for(int num : nums){
	        xor = xor ^ num;
	       }
	       return xor;
	 }
	
	public static void main(String[] args) {

        int[] nums1 = {2, 2, 1};
        System.out.println("Output: " + singleNumber(nums1)); 

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Output: " + singleNumber(nums2)); 

        int[] nums3 = {1};
        System.out.println("Output: " + singleNumber(nums3)); 
    }

}
