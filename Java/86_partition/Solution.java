
public class Solution {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public ListNode partition(ListNode head, int x) {
    	ListNode small = new ListNode(x);
    	ListNode big = new ListNode(x);
    	ListNode s = small; ListNode b = big;

    	while(head != null){

    		if(head.val < x){
    			s.next = head;
    			s = s.next;
    		}
    		else{
    			b.next = head;
    			b = b.next;
    		}
    		head = head.next;
    	}
    	b.next = null;
    	s.next = big.next;

        return small.next;
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
		int[] nums = {1,4,3,2,5,2};
		ListNode head = new ListNode(nums[nums.length-1]);
		
		for(int i = nums.length-2; i >= 0; i--){
			ListNode temp = new ListNode(nums[i]);
			temp.next = head;
			head = temp;
		}

		printNode(mySolution.partition(head,4));		
	}    
	

}
