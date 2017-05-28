import java.util.*;

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return build(0,preorder.length-1,0,inorder.length-1,preorder,inorder);
	}

	public TreeNode build(int prS, int prE, int inS, int inE, int[] preorder, int[] inorder){
		
		if(prE < prS)
			return null;
		TreeNode root = new TreeNode(preorder[prS]);

		int indexInorder = 0;
		for(int i = inS; i <= inE; i++){
			if(inorder[i] == root.val){
				indexInorder = i;
				break;
			}
		}

		root.left = build(prS+1, indexInorder - inS + prS, inS, indexInorder-1, preorder, inorder);
		root.right = build(prE -inE + indexInorder+1, prE, indexInorder+1, inE, preorder, inorder);
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

	public static void inTraversal(TreeNode head){
		System.out.printf("[");
		in(head);
		System.out.printf("\b\b]\n");
	}

	public static void in(TreeNode head){
		if(head == null)
			return;
		in(head.left);
		System.out.printf("%d, ",head.val);
		in(head.right);
	}

	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] preorder = {0,1,3,6,7,4,2,5,8,9};
		int[] inorder = {6,3,7,1,4,0,2,8,5,9};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		System.out.println(Arrays.toString(preorder));
		preTraversal(result);
		System.out.println(Arrays.toString(inorder));
		inTraversal(result);
	}    
	

}
