class Solution(object):
	def generateParenthesis(self, n):
		"""
		:type n: int
		:rtype: List[str]
		"""
		result = []
		self.dfs(n,n,"",result)
		return result


	def dfs(self,left,right, element, result):
		if left > right:
			return
		if left == 0 and right == 0:
			result.append(element)
			return
		if left > 0:
			self.dfs(left-1,right,element + "(", result)
		if right > 0:
			self.dfs(left,right-1,element + ")", result)
	

mySolution = Solution()
result = mySolution.generateParenthesis(3)

for d in result:
	print d
