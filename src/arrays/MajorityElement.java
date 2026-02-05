package arrays;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            if(count == 0){
               candidate = nums[i];
            }
           
            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }
	
	public static void main(String args[]) {
		
		// Case 1: Normal majority
        int[] nums1 = {3, 3, 4, 3, 2, 3, 3};
        System.out.println(majorityElement(nums1)); // Expected: 3

        // Case 2: Majority just above n/2
        int[] nums2 = {2, 2, 1, 1, 2};
        System.out.println(majorityElement(nums2)); // Expected: 2

        // Case 3: Single element (edge case)
        int[] nums3 = {7};
        System.out.println(majorityElement(nums3)); // Expected: 7
		
	}

}
