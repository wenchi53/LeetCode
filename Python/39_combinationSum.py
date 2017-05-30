class Solution(object):
	def combinationSum(self, candidates, target):
		"""
		:type candidates: List[int]
		:type target: int
		:rtype: List[List[int]]
		"""
		result = []
		candidates.sort()
		self.dfs(candidates,[],result,target)
		return result

	
	def dfs(self, candidates, element,result, target):
		if target == 0 and element:
			result.append(element)
			return
		if not candidates or target < candidates[0]:
			return			
		for i in xrange(len(candidates)):
			self.dfs(candidates[i:], element + candidates[i:i+1], result, target- candidates[i])		


mySolution = Solution()
result = mySolution.combinationSum([8,7,4,3],11)
for d in result:
	print d