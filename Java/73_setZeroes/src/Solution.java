import java.util.*;

public class Solution {
	
    public static void setZeroes(int[][] matrix) {

    	boolean[] row = new boolean[matrix.length];
    	boolean[] column = new boolean[matrix[0].length];
    	
    	for(int r = 0; r < matrix.length; r++)
    		for(int c = 0; c < matrix[0].length;c++){
    			if(matrix[r][c] == 0){
    				row[r] = column[c] = true;
    			}
    		}
    	for(int r = 0; r < matrix.length; r++)
    		for(int c = 0; c < matrix[0].length;c++){
    			if(row[r] == true || column[c] == true)
    				matrix[r][c] =0;
    		}
    	printMatrix(matrix);
        
    }
	
    public static void main(String[] args) {
    	int[][] matrix = {{1,0,1},{1,1,1},{1,1,0}};
    	setZeroes(matrix);
    }
    
    public static void printMatrix(int[][] matrix){
    	for(int i = 0; i < matrix.length;i++){
    		System.out.println(Arrays.toString(matrix[i]));
    	}
    }
}
