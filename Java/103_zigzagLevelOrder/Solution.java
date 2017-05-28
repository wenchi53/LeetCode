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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> ans = new ArrayList<>();
    	Queue<TreeNode> que = new LinkedList<>();

    	if(root == null)
    		return ans;

    	que.add(root);
    	int stateNumber = 1;
        int direction = 1;

    	while(true){
    		int current = 0;
    		List<Integer> element = new ArrayList<>();

    		while(current < stateNumber){
    			current++;
    			TreeNode curNode = que.poll();
    			if(curNode == null) continue;

    			element.add(curNode.val);
    			que.add(curNode.left);
    			que.add(curNode.right);
    			
    		}

    		if (element.size() == 0){
    			return ans;
    		}    		
            if(direction == 1)
    		    ans.add(element);
            else{
                Collections.reverse(element);
                ans.add(element);
            }
    		stateNumber = que.size();
            direction *= -1;
    	}
    }


	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		TreeNode result = mySolution.buildTree(preorder,inorder);
		List<List<Integer>> trees = mySolution.zigzagLevelOrder(result);

		for(int i=0; i < trees.size(); i++){
			System.out.println(trees.get(i));
		}

	}    
	

}
