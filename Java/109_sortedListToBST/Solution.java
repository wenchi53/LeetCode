import java.util.*;

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
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

	public static void printNode(ListNode head){
		while(head != null){
			System.out.printf("%d->",head.val);
			head = head.next;
		}
		System.out.println("\b\b  ");
	}

    public TreeNode sortedListToBST(ListNode head) {
    	ListNode lead = head;
    	int counter = 1;
    	while(lead != null){
    		lead = lead.next;
    		counter++;
    	}
    	return buildBST(counter-1,head);       
    }

    public TreeNode buildBST(int size, ListNode head){
    	if(size <= 0) return null;
    	int mid = size/2 - (1-size%2);
    	ListNode temp = head;
    	for(int i= 0;i < mid; i++)
    		temp = temp.next;
    	TreeNode root = new TreeNode(temp.val);
    	root.left = buildBST(mid,head);
    	root.right = buildBST(size-mid-1,temp.next);
    	return root;

    }

	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] nums = {1,2,3,4};
		ListNode head = new ListNode(nums[nums.length-1]);
		
		for(int i = nums.length-2; i >= 0; i--){
			ListNode temp = new ListNode(nums[i]);
			temp.next = head;
			head = temp;
		}


		TreeNode result = mySolution.sortedListToBST(head);
		preTraversal(result);

	}    
	

}
