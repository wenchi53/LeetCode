class Solution(object):
	def removeDuplicates(self, nums):
		"""
		:type nums: List[int]
		:rtype: int
		"""

		if not nums:
			return 0
		result = 0	
		for i in xrange(1,len(nums)):
			if nums[result] != nums[i]:
				result += 1
				nums[result] = nums[i]

		return result+1








mySolution = Solution()
print mySolution.removeDuplicates([1,1,2])
		
		