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

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        buildPath(root, sum, new ArrayList<>(), result);
        return result;
    }
    
    public void buildPath(TreeNode root, int sum, List<Integer> element, List<List<Integer>> result){
        if(root == null) return;
        element.add(root.val);
        if(root.val == sum && root.left == null  && root.right == null){
            result.add(new ArrayList<Integer>(element));
            element.remove(element.size()-1);
            return;
        }
        buildPath(root.left, sum - root.val, element, result);
        buildPath(root.right, sum - root.val, element, result);
        element.remove(element.size()-1);
    }


	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] preorder = {-2,-3};
		int[] inorder = {-2,-3};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		List<List<Integer>> path = mySolution.pathSum(result,-5);

		for(int i = 0; i < path.size(); i++)
			System.out.println(path.get(i));

	}    
	

}
