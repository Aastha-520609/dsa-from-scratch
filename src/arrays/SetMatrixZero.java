package arrays;

public class SetMatrixZero {
	    public static void setZeroes(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        boolean firstRowZero = false;
	        boolean firstColZero = false;
	        
	        //finding if the first row has 0 or not
	        for(int j = 0; j < cols; j++){
	            if(matrix[0][j] == 0){
	                firstRowZero = true;
	                break;
	            }
	        }
	        
	        //finding if the first column has 0 or not
	        for(int i = 0; i < rows; i++){
	            if(matrix[i][0] == 0){
	                firstColZero = true;
	                break;
	            }
	        }
	        
	        //Marking rows and columns which needs to be turned 0
	        for(int i = 1; i < rows; i++){
	            for(int j = 1; j < cols; j++){
	                if(matrix[i][j] == 0){
	                    matrix[i][0] = 0;
	                    matrix[0][j] = 0;
	                }
	            }
	        }

	        //Making the rows and columns 0
	        for(int i = 1; i < rows; i++){
	            for(int j = 1; j < cols; j++){
	                if(matrix[i][0] == 0 || matrix[0][j] == 0){
	                    matrix[i][j] = 0;
	                }
	            }
	        }

	        if(firstRowZero){
	          for(int j = 0; j < cols; j++){
	            matrix[0][j] = 0;
	          }
	        }

	        if(firstColZero){
	            for(int i = 0; i < rows; i++){
	                matrix[i][0] = 0;
	            }
	        }
	    }
	    
	    public static void main(String[] args) {

	        // Example 1
	        int[][] matrix1 = {
	            {1, 1, 1},
	            {1, 0, 1},
	            {1, 1, 1}
	        };

	        setZeroes(matrix1);

	        System.out.println("Example 1:");
	        printMatrix(matrix1);


	        // Example 2
	        int[][] matrix2 = {
	            {0, 1, 2, 0},
	            {3, 4, 5, 2},
	            {1, 3, 1, 5}
	        };

	        setZeroes(matrix2);

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
