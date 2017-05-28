import java.util.*;

public class Solution {

    public List<Integer> grayCode(int n) {
    	List<Integer> result = new LinkedList<>();
    	for(int i = 0; i < 1<<n; i++)
    		result.add(i^(i>>1));
    	return result;
        
    }

	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		System.out.println(mySolution.grayCode(5).size());		
	}    
	

}
