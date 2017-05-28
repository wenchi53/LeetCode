import java.util.*;

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode buildTree(int[] inorder, int[] posorder) {
		return build(0,inorder.length-1,0, posorder.length-1,inorder,posorder);
	}

	public TreeNode build(int inS, int inE, int poS, int poE, int[] inorder, int[] posorder){

		if(poE < poS || inS > inE)
			return null;
		TreeNode root = new TreeNode(posorder[poE]);

		int indexInorder = 0;
		for(int i = inS; i <= inE; i++){
			if(inorder[i] == root.val){
				indexInorder = i;
				break;
			}
		}	

		root.left = build(inS, indexInorder-1, poS, indexInorder-1 - inS + poS, inorder, posorder);
		root.right = build(indexInorder+1, inE, poE -inE + indexInorder, poE-1, inorder, posorder);
		return root;

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

	public static void posTraversal(TreeNode head){
		System.out.printf("[");
		pos(head);
		System.out.printf("\b\b]\n");
	}

	public static void pos(TreeNode head){
		if(head == null)
			return;
		pos(head.left);
		pos(head.right);		
		System.out.printf("%d, ",head.val);
	}	

	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] inorder = {6,3,7,1,4,0,2,8,5,9};
		int[] posorder = {6,7,3,4,1,8,9,5,2,0};
		TreeNode result = mySolution.buildTree(inorder, posorder);
		System.out.println(Arrays.toString(inorder));
		inTraversal(result);
		System.out.println(Arrays.toString(posorder));
		posTraversal(result);		
	}    
	

}
