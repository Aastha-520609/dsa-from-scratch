package arrays;
import java.util.List;
import java.util.ArrayList;


public class SpiralMatrix {
	    public static List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> result = new ArrayList<>();

	        int top = 0;
	        int bottom = matrix.length - 1;

	        int left = 0;
	        int right = matrix[0].length - 1;

	        while(top <= bottom && left <= right){

	            // left -> right
	            for(int j = left; j <= right; j++){
	                result.add(matrix[top][j]);
	            }
	            top++;

	            // top -> bottom
	            for(int i = top; i <= bottom; i++){
	                result.add(matrix[i][right]);
	            }
	            right--;

	            //Right -> Left  
	            if(top <= bottom){
	                for(int j = right; j >= left; j--){
	                   result.add(matrix[bottom][j]);
	                }
	                bottom--;
	            }

	            //Bottom -> Top
	            if(left <= right){
	                for(int i = bottom; i >= top; i--){
	                    result.add(matrix[i][left]);
	                }
	                left++;
	            }
	        }
	        return result;
	    }
	    
	    public static void main(String[] args) {

	        // Example 1
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        List<Integer> result1 = spiralOrder(matrix1);

	        System.out.println("Example 1:");
	        System.out.println(result1);


	        // Example 2
	        int[][] matrix2 = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };

	        List<Integer> result2 = spiralOrder(matrix2);

	        System.out.println("\nExample 2:");
	        System.out.println(result2);
	    }
}
