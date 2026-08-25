package arrays;

public class RotateMatrix {
	    public static void rotate(int[][] matrix) {
	        int n = matrix.length;

	        for(int i = 0; i < n; i++){
	            for(int j = i + 1; j < n; j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        for(int i = 0; i < n; i++){
	            
	            int left = 0;
	            int right = n - 1;

	            while(left < right){
	                int temp = matrix[i][left];
	                matrix[i][left] = matrix[i][right];
	                matrix[i][right] = temp;

	                left++;
	                right--;
	            }
	        }
	    }
	    
	    public static void main(String[] args) {

	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        rotate(matrix1);

	        System.out.println("Example 1:");
	        printMatrix(matrix1);


	        int[][] matrix2 = {
	            {5, 1, 9, 11},
	            {2, 4, 8, 10},
	            {13, 3, 6, 7},
	            {15, 14, 12, 16}
	        };

	        rotate(matrix2);

	        System.out.println("\nExample 2:");
	        printMatrix(matrix2);
	    }

	    public static void printMatrix(int[][] matrix) {

	        for (int i = 0; i < matrix.length; i++) {

	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }

	            System.out.println();
	        }
	    }

}
