class ListNode(object):
	def __init__(self, x):
		self.val = x
		self.next = None

class Solution(object):
	def swapPairs(self, head):
		"""
		:type head: ListNode
		:rtype: ListNode
		"""
		newHead = ListNode(0)
		newHead.next = head
		temp = ListNode(0)
		current = newHead

		while current.next:
			if current.next.next:
				temp = current.next
				current.next = temp.next
				temp.next = current.next.next
				current.next.next = temp
				current = temp
			else:
				current = current.next	
		return newHead.next

	def printNode(self, node):
		print "================"
		while node:
			print node.val
			node = node.next

		print "****************"
			





Node = ListNode(1)
'''
for i in xrange(2,6):
	nodeTemp = ListNode(i)
	nodeTemp.next = Node
	Node = nodeTemp


print [Node.val,Node.next.val,Node.next.next.val,Node.next.next.next.val,Node.next.next.next.next.val]
'''
	   
mySolution = Solution()
node = mySolution.swapPairs(Node)

while node:
	print node.val
	node = node.next		