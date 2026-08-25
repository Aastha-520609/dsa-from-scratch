package arrays;
import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveSequence {
	    public static int longestConsecutive(int[] nums) {
	        Set<Integer> set = new HashSet<Integer>();

	        for(int num : nums){
	            set.add(num);
	        }

	        int longest = 0;

	        for(int num : set){
	            
	            if(!set.contains(num - 1)){
	                int currentNum = num;
	                int currentLength = 1;

	                while(set.contains(currentNum + 1)){
	                    currentNum++;
	                    currentLength++;
	                }

	                longest = Math.max(currentLength, longest);
	            }
	        }
	        return longest;
	    }
	    
	    public static void main(String[] args) {

	        int[] nums = {100, 4, 200, 1, 3, 2};

	        int result = longestConsecutive(nums);

	        System.out.println("Longest consecutive sequence = " + result);
	    }
	}
