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

    public int maxDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	return(1+Math.max(maxDepth(root.left),maxDepth(root.right)));
        
    }

	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		System.out.println(mySolution.maxDepth(result));


	}    
	

}
