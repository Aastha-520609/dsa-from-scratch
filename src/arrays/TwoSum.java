package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int value = target - nums[i];

            if(hmap.containsKey(value)){
                return new int[]{hmap.get(value), i};
            }

            hmap.put(nums[i], i);
        }

        return new int[]{};
    }
	
	public static void main(String args[]) {
		
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Case 1 Output: " + Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Case 2 Output: " + Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Case 3 Output: " + Arrays.toString(twoSum(nums3, target3)));
		
	}

}
