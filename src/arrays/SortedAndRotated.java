package arrays;

public class SortedAndRotated {
	public static boolean check(int[] nums) {
	       int n = nums.length;
	       int count = 0;

	       for(int i = 0; i < n-1; i++){
	         if(nums[i] > nums[i+1]){
	            count++;
	         }
	       }

	       if(nums[n-1] > nums[0]){
	        count++;
	       }

	       return count <= 1;
	    }
	
	public static void main(String[] args) {

	    int[] arr1 = {1, 2, 3, 4, 5};
	    int[] arr2 = {3, 4, 5, 1, 2};
	    int[] arr3 = {2, 1, 3, 4};

	    System.out.println(check(arr1)); // true
	    System.out.println(check(arr2)); // true
	    System.out.println(check(arr3)); // false
	}

}
