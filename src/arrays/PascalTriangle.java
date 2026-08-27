package arrays;
import java.util.List;
import java.util.ArrayList;


public class PascalTriangle {
	    public static List<List<Integer>> generate(int numRows) {

	        List<List<Integer>> result = new ArrayList<>();

	        for(int i = 0; i < numRows; i++){
	            List<Integer> currentRow = new ArrayList<>();

	            currentRow.add(1);

	            for(int j = 1; j < i; j++){
	                List<Integer> previousRow = result.get(i-1);

	                int value = previousRow.get(j-1) + previousRow.get(j);

	                currentRow.add(value);
	            }

	            if( i > 0 ){
	                currentRow.add(1);
	            }

	            result.add(currentRow);
	        }

	    return result; 
	    }
	    
	    public static void main(String[] args) {

	        int numRows = 5;

	        List<List<Integer>> result = generate(numRows);

	        System.out.println(result);
	    }

}
