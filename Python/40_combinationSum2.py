class Solution(object):
	def combinationSum2(self, candidates, target):
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
			if i > 0 and candidates[i] == candidates[i-1]:
				continue 
			self.dfs(candidates[i+1:], element + candidates[i:i+1], result, target- candidates[i])		


mySolution = Solution()
result = mySolution.combinationSum2([10, 1, 2, 7, 6, 1, 5],8)
for d in result:
	print d