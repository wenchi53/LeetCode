
public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public ListNode deleteDuplicates(ListNode head) {

		ListNode zero = new ListNode(0);
		zero.next = head;

		ListNode right = zero; ListNode left = zero;

		while(left.next != null){
			right = left.next;
			int flag = 0;
			while(right.next != null && right.next.val == right.val){
				right = right.next;
				flag = 1;
			}

			if(flag == 1)
				left.next = right.next;
			else
				left = left.next;
		}

		return zero.next;	
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
		int[] nums = {1,1,2, 2, 3, 3, 4, 4, 5,5};
		ListNode head = new ListNode(nums[nums.length-1]);
		
		for(int i = nums.length-2; i >= 0; i--){
			ListNode temp = new ListNode(nums[i]);
			temp.next = head;
			head = temp;
		}

		printNode(mySolution.deleteDuplicates(head));		
	}    
	

}
