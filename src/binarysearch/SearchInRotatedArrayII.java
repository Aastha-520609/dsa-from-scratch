package binarysearch;

public class SearchInRotatedArrayII {
	public static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return true;
            }
            
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
            	low++;
            	high--;
            	continue;
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

        return false;
    }
	
	public static void main(String[] args) {
		
	    int[] nums1 = {2,5,6,0,0,1,2};
	    int target1 = 0;
	    System.out.println("Example 1 Output: " + search(nums1, target1));
	
	    
	    int[] nums2 = {2,5,6,0,0,1,2};
	    int target2 = 3;
	    System.out.println("Example 2 Output: " + search(nums2, target2));
	
	
	    
	    int[] nums3 = {1,1,1,0,1};
	    int target3 = 1;
	    System.out.println("Example 3 Output: " + search(nums3, target3));
	}
	

}
