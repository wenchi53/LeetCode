import java.util.*;

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public static void preTraversal(TreeNode head){
		System.out.printf("[");
		pre(head);
		System.out.printf("\b\b]\n");
	}

	public static void pre(TreeNode head){
		if(head == null)
			return;
		System.out.printf("%d, ",head.val);
		pre(head.left);
		pre(head.right);
	}

    public List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return new ArrayList<>();    	
    	return generate(1,n);
    }

    public List<TreeNode> generate(int start, int end){
    	List<TreeNode> result = new ArrayList<TreeNode>();

    	if(start > end){
    		result.add(null);
    		return result;
    	}

    	List<TreeNode> left,right;
    	for(int i = start; i <= end; i++){
    		left = generate(start,i-1);
    		right = generate(i+1,end);

    		for(int j = 0; j < left.size(); j++)
    			for(int k = 0; k < right.size(); k++){
    				TreeNode root = new TreeNode(i);
    				root.left = left.get(j);
    				root.right = right.get(k);
    				result.add(root);
    			}
    	}

    	return result;

    }

	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();

		List<TreeNode> result = mySolution.generateTrees(4);
		
		for(int i = 0; i < result.size(); i++)
			preTraversal(result.get(i));
		
		System.out.println(result.size());	
	}    
	

}
