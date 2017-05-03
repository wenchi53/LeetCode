
class ListNode(object):
	def __init__(self, x):
		self.val = x
		self.next = None

class Solution(object):
	def removeNthFromEnd(self, head, n):
		"""
		:type head: ListNode
		:type n: int
		:rtype: ListNode
		"""
		lead = result = head
		for _ in xrange(n):
			lead = lead.next
		if not lead:
			return head.next
		while lead.next:
			lead = lead.next
			result = result.next
		result.next = result.next.next		

		return head

Node = ListNode(1)
for i in xrange(2,6):
	nodeTemp = ListNode(i)
	nodeTemp.next = Node
	Node = nodeTemp
	   
mySolution = Solution()
node = mySolution.removeNthFromEnd(Node,2)

while node:
	print node.val
	node = node.next
