class ListNode(object):
	def __init__(self, x):
		self.val = x
		self.next = None

class Solution(object):
	def rotateRight(self, head, k):
		if not head:
			return head
		elif not head.next:
			return head

		length = 1
		pointer = head
		while pointer.next:
			pointer = pointer.next
			length += 1
		k %= length
		
		if k==0:
			return head		
			
		before = lead = head
		for _ in xrange(k):
			lead = lead.next	
		

		while lead.next:
			lead = lead.next
			before = before.next
		lead.next = head
		head = before.next
		before.next = None
		return head		


def printNode(self, node):
	result = []
	while node:
		result.append(node.val)
		node = node.next
	print node	

Node = ListNode(2)
for i in xrange(1,3):
	nodeTemp = ListNode(i)
	nodeTemp.next = Node
	Node = nodeTemp
	
	   
mySolution = Solution()
node = mySolution.rotateRight(Node.next,3)

while node:
	print node.val
	node = node.next		