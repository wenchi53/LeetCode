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
/*
    public void flatten(TreeNode root) {
    	Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
    	TreeNode head = root;

    	while(head != null || !stack.isEmpty()){
    		if(head.right != null){
    			stack.push(head.right);			
    		}    		
    		if(head.left != null){
    			head.right = head.left;
    			head.left = null;    			
    		}
    		else if(!stack.isEmpty())
    			head.right = stack.pop();    		
    		head = head.right;   		
    	}    
    }
*/
    private TreeNode previous = null;
	public void flatten(TreeNode root) {
		if(root == null) return;
		flatten(root.right);
		flatten(root.left);
		root.right = previous;
		root.left = null;
		previous = root;
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
		int[] preorder = {3,2,4,1};
		int[] inorder = {2,3,1,4};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		mySolution.flatten(result);
		while(result != null){
			System.out.printf("%d->",result.val);
			result = result.right;
		}
		System.out.printf("\b\b  \n");

	}    
	

}
