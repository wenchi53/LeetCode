
public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(m==n)
    		return head;

    	ListNode zero = new ListNode(0);
    	zero.next = head;
    	ListNode mPtr = zero;
    	for(int i = 0; i < m-1; i++)
    		mPtr = mPtr.next;
    	ListNode front = mPtr.next, tail = mPtr.next;
    	mPtr.next = mPtr.next.next;

    	for(int i = 0; i < n-m; i++){
    		ListNode temp = mPtr.next;
    		mPtr.next = mPtr.next.next;
    		temp.next = front;
    		front = temp;
    	}

    	tail.next = mPtr.next;
    	mPtr.next = front;

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
		int[] nums = {1,2,3,4,5};
		ListNode head = new ListNode(nums[nums.length-1]);
		
		for(int i = nums.length-2; i >= 0; i--){
			ListNode temp = new ListNode(nums[i]);
			temp.next = head;
			head = temp;
		}

		printNode(mySolution.reverseBetween(head,5,5));		
	}    
	

}
