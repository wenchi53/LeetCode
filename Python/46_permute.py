class Solution(object):
	def permute(self, nums):
		combination = []
		self.permute_helper(nums, [], combination)
		return combination
		
	def permute_helper(self, residual, element, combination):
		if(not residual):
			combination.append(element)
		for i in xrange(len(residual)):
			self.permute_helper(residual[:i] + residual[i+1:], element + [residual[i]], combination)


		
mySolution = Solution()
out =  mySolution.permute([1,2,3])
for d in out:
	print d