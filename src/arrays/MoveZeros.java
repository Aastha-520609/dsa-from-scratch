package arrays;

import java.util.Arrays;

public class MoveZeros {
	public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for(int i = j+1; i < nums.length; i++){
            if(nums[i] != 0){
               swap(nums, i , j);
               j++;
            }
        }
    }
    
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 0, 3, 12};
        moveZeroes(arr1);
        System.out.println("Test 1: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4};
        moveZeroes(arr2);
        System.out.println("Test 2: " + Arrays.toString(arr2));

        int[] arr3 = {0, 0, 0};
        moveZeroes(arr3);
        System.out.println("Test 3: " + Arrays.toString(arr3));
    }

}
