import java.util.*;
public class Solution {

    public List<List<Integer>> combine(int n, int k) {

		List<Integer> element = new ArrayList<>();
    	List<List<Integer>> result = new ArrayList<>();
    	recursive_combine(k, n, element, result);
    	return result;
    }
	
    void recursive_combine(int k,int remain,List<Integer> element,List<List<Integer>> result){
    	if(k > remain)
    		return;
    	if(k == 0 ){
    		for(int i = 0; i < element.size();i++){
    			System.out.printf("%d,",element.get(i));
    		}
    		System.out.println("");
    		result.add(new ArrayList<Integer>(element));
    		return;
    	}
    				
  			
    	element.add(remain);
    	recursive_combine(k-1, remain-1, element, result);
    	element.remove(element.size()-1);  	
    	recursive_combine(k, remain-1, element, result);
    	
   	

    }
    

/*	
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> acc = new ArrayList<>();
        
        solve(n, k, ans, acc);
        
        return ans;
    }
    
    void solve(int n, int k, List<List<Integer>> ans, ArrayList<Integer> acc) {
        if(n < k)
            return;
        
        if(k == 0) {
            ans.add(new ArrayList<Integer>(acc));
    		for(int i = 0; i < acc.size();i++){
    			System.out.printf("%d,",acc.get(i));
    		}
            System.out.println("");
            return;
        }
        
        acc.add(n);
        solve(n - 1, k - 1, ans, acc);
        
        acc.remove(acc.size() - 1);
        
        solve(n - 1, k, ans, acc);
        
    }	
*/	
    public static void main(String[] args) { 
        Solution mySolution = new Solution();
        mySolution.combine(4, 2);
    }	

}
