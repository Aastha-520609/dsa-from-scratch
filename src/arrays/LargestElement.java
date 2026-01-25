package arrays;

public class LargestElement {
	 public static int largest(int[] nums) {
	
	        int largest = nums[0];
	        for(int i=1; i < nums.length; i++){
	            if(nums[i] > largest){
	                largest = nums[i];
	            }
	        }
	        return largest;
	  }
	 
	  public static void main(String[] args) {

	        int[] arr1 = {10, 20, 5, 30, 25};
	        int[] arr2 = {7, 3, 9, 2};
	        int[] arr3 = {100};

	        System.out.println("Largest in arr1: " + largest(arr1));
	        System.out.println("Largest in arr2: " + largest(arr2));
	        System.out.println("Largest in arr3: " + largest(arr3));
	    }
}
