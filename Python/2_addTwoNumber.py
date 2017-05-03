# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):

    	carry = 0
    	result = nextListNode = ListNode(0)

    	while l1 or l2 or carry:
    		if l1:
    			carry += l1.val
    			l1 = l1.next
    		if l2:
    			carry += l2.val
    			l2 = l2.next
    		nextListNode.next = ListNode(carry%10)
    		nextListNode = nextListNode.next
    		carry //= 10

    	return result.next

        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)

l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)


my_solution = Solution()
finaResult = my_solution.addTwoNumbers(l1,l2)

print finaResult.val
print finaResult.next.val
print finaResult.next.next.val
