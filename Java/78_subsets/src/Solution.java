import java.util.*;

public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result= new ArrayList<>();
		int count = 1<<nums.length;
		for(int i=0; i < count; i++){
			List<Integer> element = new ArrayList<Integer>();
			for(int j=0; j < nums.length; j++){
				if(((1<<j) & i)!=0)
					element.add(nums[j]);
			}
			result.add(element);
		}	
		return result;
	}
	
	
	
	/*
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        subset_recursive(0, nums, new ArrayList<>(), result);
        return result;
        
    }
    
    void subset_recursive(int start,int[] nums, List<Integer> element, List<List<Integer>> result){
    	
    	result.add(new ArrayList<Integer>(element));
    	
    	for(int i= start; i < nums.length;i++){
    	element.add(nums[i]);
    	subset_recursive(i+1,nums,element,result);
    	element.remove(element.size()-1);
    	}
    }
    */
    void printList(List<List<Integer>> result){
    	for(int i=0; i < result.size();i++){
    		for(int j= 0; j < result.get(i).size();j++){
    			System.out.printf("%d,", result.get(i).get(j));
    		}
    		System.out.println("");
    	}
    }
    
    public static void main(String[] args) { 
        Solution mySolution = new Solution();
        int[] nums = {1,2,3};
        mySolution.subsets(nums);
    }	    

}
