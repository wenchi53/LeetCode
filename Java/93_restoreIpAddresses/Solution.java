import java.util.*;

public class Solution {

    public List<String> restoreIpAddresses(String s) {
    	List<String> result = new ArrayList<>();
    	restore(0,s,"",result);
    	return result;
        
    }

    public void restore(int counter, String s, String element, List<String> result){
    	if(counter > 4 || (s.equals("") && counter != 4))
    		return;
    	if(s.equals("")){
    		result.add(element.substring(0,element.length()-1));
    		return;
    	}
    	restore(counter+1,s.substring(1,s.length()),element+ s.substring(0,1) + ".",result);
    	if(s.length() > 1 && Integer.parseInt(s.substring(0,1)) != 0)
    		restore(counter+1,s.substring(2,s.length()),element + s.substring(0,2) + ".",result);
    	if(s.length() > 2 && Integer.parseInt(s.substring(0,3)) > 99 && Integer.parseInt(s.substring(0,3)) < 256)
    		restore(counter+1,s.substring(3,s.length()),element + s.substring(0,3) + ".",result);
    }

    public static void printResult(List<String> result){
    	for(int i = 0; i < result.size(); i++)
    		System.out.println(result.get(i));
    }
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		printResult(mySolution.restoreIpAddresses(""));		
	}    
	

}
