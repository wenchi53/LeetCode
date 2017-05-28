import java.util.*;

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

    public TreeNode sortedArrayToBST(int[] nums) {
    	return buildBST(0, nums.length-1, nums);     
    }

	public TreeNode buildBST(int start, int end, int[] nums){
		if(start > end) return null;
		int mid = start + (end - start)/2;
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = buildBST(start, mid-1,nums);
    	root.right = buildBST(mid+1, end,nums);
    	return root;
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

	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] input = {1,2,3,4};
		TreeNode result = mySolution.sortedArrayToBST(input);
		preTraversal(result);

	}    
	

}
