import java.util.*;
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

        List<Integer> element = new ArrayList<Integer>();
        element.add(1);
        if(numRows == 1){
        	result.add(element);
        	return result;
        }
        result = generate(numRows-1);  
        for(int i=1; i < numRows-1; i++){
        	element.add(result.get(result.size()-1).get(i-1) + result.get(result.size()-1).get(i));
        }
        element.add(1);


       	result.add(element);
        return result;
    }	
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		List<List<Integer>> result = mySolution.generate(5);
		for(int i=0;i < result.size();i++)
			System.out.println(result.get(i));		
	}    
	

}
