class ListNode(object):
	def __init__(self, x):
		self.val = x
		self.next = None

class Solution(object):
	def mergeTwoLists(self, l1, l2):
		"""
		:type l1: ListNode
		:type l2: ListNode
		:rtype: ListNode
		"""
		newHead = ListNode(0)
		current = newHead

		while l1 and l2:

			if l1.val < l2.val:
				current.next = l1
				current, l1 = current.next, l1.next								
			else:
				current.next = l2
				current, l2 = current.next, l2.next	
	
		if not l1: current.next = l2;
		else: current.next = l1;

		return newHead.next		
									
	def printNode(self,node):
		a = []
		while node:
			a.append(node.val)
			node = node.next
		print a	 





a = 6
Node1 = ListNode(a)
for i in xrange(a,1,-1):
	nodeTemp = ListNode(i)
	nodeTemp.next = Node1
	Node1 = nodeTemp

b = 10
Node2 = ListNode(b)
for i in xrange(b-1,7,-1):
	nodeTemp = ListNode(i)
	nodeTemp.next = Node2
	Node2 = nodeTemp	
	   
mySolution = Solution()
node = mySolution.mergeTwoLists(Node1,Node2)

a = []
while node:
	a.append(node.val)
	node = node.next
print a	        
		