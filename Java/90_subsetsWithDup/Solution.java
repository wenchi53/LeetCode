import java.util.*;

public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> result = new ArrayList<>();
    	recursive(nums,0,new ArrayList<>(),result);
    	return result;
    }

    public void recursive(int[] nums, int ptr, List<Integer> element, List<List<Integer>> result){
    	if(ptr <= nums.length)
    		result.add(element);
    	int i = ptr;
    	while(i < nums.length){
    		element.add(nums[i]);
    		recursive(nums,i+1,new ArrayList<>(element),result);
    		element.remove(element.size()-1);
    		i++;
    		while (i < nums.length && nums[i] == nums[i - 1]) {i++;}
    	}
    	return;
    }

    static void printList(List<List<Integer>> result){
    	for(int i = 0; i < result.size(); i++)
    		System.out.println(result.get(i));
    }	
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] nums = {1,2,2};
		printList(mySolution.subsetsWithDup(nums));		
	}    
	

}
