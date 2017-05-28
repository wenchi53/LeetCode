
public class Solution {

    public int removeDuplicates(int[] nums) {
    	
    	int i = 0;
    	for(int n : nums)
    		if(i < 2 || n > nums[i-2])
    			nums[i++] = n;
    	return i;
    }
	
    public static void main(String[] args) { 
        Solution mySolution = new Solution();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(mySolution.removeDuplicates(nums));
    }	
}