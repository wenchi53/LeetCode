class Solution(object):
	def isValid(self, s):
		"""
		:type s: str
		:rtype: bool
		"""
		table = {")":"(","]":"[","}":"{"}
		stack = []

		for i in xrange(len(s)):
			if s[i] in ["(","[","{"]:
				stack.append(s[i])
			else:
				if not stack or table[s[i]] != stack[len(stack)-1]:
					return False	
				else:
					stack.pop(len(stack)-1)
		return not stack

mySolution = Solution()

print mySolution.isValid("[")
#print mySolution.isValid("([)]")
		