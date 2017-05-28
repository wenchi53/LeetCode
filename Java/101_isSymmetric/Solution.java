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

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left, root.right);
    }

    public boolean symmetric(TreeNode p, TreeNode q) {
    	if(p==null || q == null) return p==q;
    	return (p.val == q.val) && symmetric(p.left, q.right) && symmetric(p.right, q.left);       
    }
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] preorder = {1,2,3,4,2,4,3};
		int[] inorder = {3,2,4,1,4,2,3};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		System.out.println(mySolution.isSymmetric(result));

	}    
	

}
