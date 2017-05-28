//import java.util.*;
public class Solution {

    public static boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0 || matrix[0].length == 0){
    		return false;
    	}
    	int u = 0, d = matrix.length-1, l = 0, r = matrix[0].length-1;
    	int mid = 0;
    	while(u < d){
    		mid = (u + d)/2;
    		if(matrix[mid][0] < target)
    			u = mid + 1;
    		else if(matrix[mid][0] > target)
    			d = mid;
    		else
    			return true;  		
    	}
    	
    	if(matrix[u][0] > target && u > 0)
    		u--;
	
    	while(l < r){
    		mid = (l + r)/2;
    		if(matrix[u][mid] < target)
    			l = mid + 1;
    		else if(matrix[u][mid] > target)
    			r = mid;
    		else
    			return true;  		
    	}   	
        return matrix[u][l] == target;
    }	
	
	
	public static void main(String[] args){
		//int[][] matrix = {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
		int[][] matrix = {{1}};
		System.out.println(searchMatrix(matrix,1));
		
	}

}
