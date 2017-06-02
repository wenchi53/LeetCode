
public class Solution {

	public static class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	}

    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head == null) return null;
    	RandomListNode lead = head, copy;
    	while(lead != null){
    		copy = lead.next;
    		lead.next = new RandomListNode(lead.label);
    		lead.next.next = copy;
    		lead = copy;
    	}
    	lead = head;
    	while(lead != null){
    		if(lead.random != null)
    			lead.next.random = lead.random.next;
    		lead = lead.next.next;   		
   		}

    	copy = new RandomListNode(head.label);
    	RandomListNode result = copy;
    	lead = head;
    	while(lead != null){
    		copy.next = lead.next;
    		lead.next = lead.next.next;
    		copy = copy.next;
    		lead = lead.next;
    	}
    	return result.next;
    }

	public static void printNode(RandomListNode head){
		while(head != null){
			System.out.printf("%d->",head.label);
			head = head.next;
		}
		System.out.println("\b\b  ");
	}	
	
	public static void main(String[] args) { 

		Solution mySolution = new Solution();
		int[] nums = {1,2,3,4,5};
		RandomListNode head = new RandomListNode(nums[nums.length-1]);
		
		for(int i = nums.length-2; i >= 0; i--){
			RandomListNode temp = new RandomListNode(nums[i]);
			temp.next = head;
			temp.random = temp;
			head = temp;
		}

		printNode(mySolution.copyRandomList(head));
		printNode(head);	
	}    
	

}
