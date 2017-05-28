
public class Solution {

    public int numDecodings(String s) {
    	int left = 1; int right = 1; int result = 0;

    	for(int i = 0; i < s.length();i++){
    		result = 0;
    		if(Integer.parseInt(s.substring(i,i+1)) != 0)
    			result += right;
    		if(i!=0 && Integer.parseInt(s.substring(i-1,i+1)) >= 10 && Integer.parseInt(s.substring(i-1,i+1)) <=26)
    			result += left;
    		left = right;
    		right = result;

    	}
        return result;
    }	
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		System.out.println(mySolution.numDecodings(""));		
	}    
	

}
