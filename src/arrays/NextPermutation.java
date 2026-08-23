package arrays;

import java.util.Arrays;

public class NextPermutation {
	
	public static void nextPermutation(int[] nums) {
        int n = nums.length; 
        int pivot = -1;

        for(int i = n - 2; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for(int i = n - 1; i > pivot ; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
    
    }

    public static void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void reverse(int[] nums, int x, int y){
        while ( x < y ){
            swap(nums, x, y);
            x++;
            y--;
        }
    }
    
    public static void main(String args[]) {
    	int[] array1 = {1,2,3};
    	nextPermutation(array1);
    	System.out.println(Arrays.toString(array1));
    	
    	int[] array2 = {1,3,5,4,2};
    	nextPermutation(array2);
    	System.out.println(Arrays.toString(array2));
    	
    }

}
