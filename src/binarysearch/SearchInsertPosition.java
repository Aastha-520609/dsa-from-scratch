package binarysearch;

public class SearchInsertPosition {
	
	public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = nums.length;

        while( low <= high){
            int mid = ( low + high )/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
        
    }
	
	public static void main(String args[]) {
		
        int[] arr1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Case 1 (Element present): " + searchInsert(arr1, target1));
        
        int[] arr2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Case 2 (Insert in middle): " + searchInsert(arr2, target2));
 
        int[] arr3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Case 3 (Insert at end): " + searchInsert(arr3, target3));
		
	}

}
