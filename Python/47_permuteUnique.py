class Solution(object):
	def permuteUnique(self, nums):
		combination = []
		nums.sort()
		self.permute_helper(nums, [], combination)
		return combination
		
	def permute_helper(self, residual, element, combination):
		if(not residual):
			combination.append(element)
		for i in xrange(len(residual)):
			if i > 0 and residual[i] == residual[i-1]:
				continue
			self.permute_helper(residual[:i] + residual[i+1:], element + [residual[i]], combination)

mySolution = Solution()
result = mySolution.permuteUnique([1,1,2])
for d in result:
	print d