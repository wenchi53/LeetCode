import java.util.*;

public class Solution {
    public static void sortColors(int[] nums) {
    	int zero = 0, two = nums.length-1;
    	for(int i=0; i <= two; i++)
    		if(nums[i] == 0 & i!= zero){
    			nums[zero] = swap(nums[i],nums[i] = nums[zero]);
    			zero++;i--;
    		}
    		else if(nums[i] == 2 & i!= two){
    			nums[two] = swap(nums[i],nums[i] = nums[two]);
    			two--;i--; 			
    		}
    	}
    public static int swap(int itself, int dummy){
    	    return itself;
    	}	
    	
   	
    	
        
    
    
    public static void main(String[] args) {
    	int[] ball = {0,0,1,2,1,2,1,0};
    	sortColors(ball);
    	System.out.println(Arrays.toString(ball));
    }
    
}
