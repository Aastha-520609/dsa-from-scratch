package binarysearch;

public class BinarySearch {
	public static void main(String args[]) {
		
        int[] arr1 = {1, 3, 5, 7, 9};
        int target1 = 5;
        int result1 = search(arr1, target1);
        System.out.println("Scenario 1 (Found in middle): Index = " + result1);

        int[] arr2 = {2, 4, 6, 8, 10};
        int target2 = 2;
        int result2 = search(arr2, target2);
        System.out.println("Scenario 2 (Found at beginning): Index = " + result2);

        int[] arr3 = {1, 3, 5, 7, 9};
        int target3 = 6;
        int result3 = search(arr3, target3);
        System.out.println("Scenario 3 (Not found): Index = " + result3);
		
	}
	
	public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while( low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }

}
