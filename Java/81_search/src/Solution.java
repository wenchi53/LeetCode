
public class Solution {
    public boolean search(int[] nums, int target) {
    	if(nums.length < 1)
    		return false;
    	
    	int l = 0; int h = nums.length-1;
    	while(l < h){
    		int mid = (l+h)/2;
    		//System.out.printf("(%d,%d,%d)\n",l,mid,h);
    		if(nums[mid] == target)
    			return true;
    		
    		if(nums[l] == nums[h]){
    			l++;
    			continue;}
    		
    		if(nums[l] <= nums[mid])
    			if(target < nums[mid] && nums[l] <= target && nums[l] != nums[mid])
    				h = mid;
    			else		
    				l = mid + 1;    				
    		else if(nums[mid] <= nums[h])
    			if(nums[mid] < target && nums[h] >= target && nums[h] != nums[mid])
    				l = mid + 1;
    			else
    				h = mid;
    		
    	}
        return nums[h] == target;
    }
    
    
    public static void main(String[] args) { 
        Solution mySolution = new Solution();
        int[] nums = {1,3,1};
        System.out.println(mySolution.search(nums,3));
    }    
    

}
