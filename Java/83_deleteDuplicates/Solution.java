
public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public ListNode deleteDuplicates(ListNode head) {
    	ListNode left = head; ListNode right = head;

    	while(left != null){
    		right = left.next;
    		while(right != null){
    			if(right.val != left.val)
    				break;
    			right = right.next;
    			left.next = right;
    		}
    		left = left.next;
    	}
    	return head;
        
    }

	public static void printNode(ListNode head){
		while(head != null){
			System.out.printf("%d->",head.val);
			head = head.next;
		}
		System.out.println("\b\b  ");
	}
	
	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] nums = {0,0,0,0,0,1,1,1,1,1,1,1};
		ListNode head = new ListNode(nums[nums.length-1]);
		
		for(int i = nums.length-2; i >= 0; i--){
			ListNode temp = new ListNode(nums[i]);
			temp.next = head;
			head = temp;
		}

		printNode(mySolution.deleteDuplicates(head));		
	}    
	

}
