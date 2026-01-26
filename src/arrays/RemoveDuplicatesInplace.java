package arrays;

public class RemoveDuplicatesInplace {
	 public static int removeDuplicates(int[] nums) {
	        int i = 0;
	        for(int j = 1; j < nums.length ; j++){
	            if(nums[i] != nums[j]){
	                nums[i+1] = nums[j];
	                i++;
	            }
	        }

	        return i+1;
	    }
	 
	 public static void main(String[] args) {

	        int[] nums = {1, 1, 2, 2, 3, 4, 4};

	        RemoveDuplicatesInplace obj = new RemoveDuplicatesInplace();

	        int k = obj.removeDuplicates(nums);

	        System.out.println("Length after removing duplicates: " + k);

	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(nums[i] + " ");
	        }
	 }
}
