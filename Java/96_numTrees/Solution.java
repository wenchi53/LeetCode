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

    public int numTrees(int n) {
        int[] g = new int[n+1];
        g[0] = g[1] = 1;
        for(int i = 2; i <= n; i++)
        	for(int j = 1; j <= i; j++)
        		g[i] += g[j-1]*g[i-j];

        return g[n];	
    }
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();

		System.out.println(mySolution.numTrees(4));
		
	}    
	

}
