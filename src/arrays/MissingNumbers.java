package arrays;

public class MissingNumbers {
	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		
		for(int val = 1; val <= n; val++) {
			
			boolean found = false;
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == val) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				return val;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		System.out.println(missingNumber(arr));
	}
}
