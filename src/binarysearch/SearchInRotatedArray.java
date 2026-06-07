package binarysearch;

public class SearchInRotatedArray {
	
	public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[low] <= nums[mid])
            {
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else
            {
               if(target > nums[mid] && target <= nums[high]){
                  low = mid + 1;
               }
               else{
                 high = mid - 1;
               }
            }
        }

        return -1;
    }
	
	public static void main(String[] args) {
		
	    int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
	    int target1 = 0;
	    System.out.println("Example 1 Output: " + search(nums1, target1));
	
	    
	    int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
	    int target2 = 3;
	    System.out.println("Example 2 Output: " + search(nums2, target2));
	
	
	    
	    int[] nums3 = {1};
	    int target3 = 0;
	    System.out.println("Example 3 Output: " + search(nums3, target3));
	}

}
