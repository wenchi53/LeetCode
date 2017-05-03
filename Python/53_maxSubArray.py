class Solution(object):
	def maxSubArray(self, nums):

		result = -2**31
		sums = 0	

		for i in xrange(len(nums)):
			if sums < 0:
				sums = nums[i]
			else:
				sums += nums[i]
			if sums > result:
				result = sums
		return result				


mySolution = Solution()
print mySolution.maxSubArray([-2,1,-3,4,-1,2,1,-5,4])		