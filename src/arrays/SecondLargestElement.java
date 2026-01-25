package arrays;

public class SecondLargestElement {
	 public static int getSecondLargest(int[] arr) {
	        int largest = arr[0];
	        int secondLargest = -1;
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i] > largest){
	                secondLargest = largest;
	                largest = arr[i];
	            }
	            else if(arr[i] < largest && arr[i] > secondLargest){
	                secondLargest = arr[i];
	            }
	        }
	        
	        return secondLargest;
	    }
	 
	  public static void main(String[] args) {

	        int[] arr1 = {10, 20, 5, 30, 25};
	        int[] arr2 = {7, 3, 9, 2};
	        int[] arr3 = {100};

	        System.out.println("Second Largest in arr1: " + getSecondLargest(arr1));
	        System.out.println("Second Largest in arr2: " + getSecondLargest(arr2));
	        System.out.println("Second Largest in arr3: " + getSecondLargest(arr3));
	    }

}
