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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelResult = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root == null) return levelResult;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNumber = queue.size();
            List<Integer> element = new LinkedList<>();
            for(int i = 0; i < levelNumber; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                element.add(queue.poll().val);
            }
            levelResult.add(0,element);
        }
        return levelResult;
        
    }    

	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		List<List<Integer>> trees = mySolution.levelOrderBottom(result);

		for(int i=0; i < trees.size(); i++){
			System.out.println(trees.get(i));
		}

	}    
	

}
