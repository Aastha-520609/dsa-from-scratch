package arrays;
import java.util.List;
import java.util.ArrayList;

public class MajorityElement2 {
	public static List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        for(int num : nums){

            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : nums){

            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        int limit = nums.length / 3;

        if(count1 > limit){
            result.add(candidate1);
        }

        if(count2 > limit && candidate2 != candidate1){
            result.add(candidate2);
        }

        return result;
    }
	
	public static void main(String args[]) {
		int[] nums = {1, 2, 1, 1, 3, 2, 2};

        List<Integer> result = majorityElement(nums);

        System.out.println(result);
	}

}
