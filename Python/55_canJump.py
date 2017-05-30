class Solution(object):
	def canJump(self, nums):
		"""
		:type nums: List[int]
		:rtype: bool
		"""

		destination = len(nums)-1

		for i in xrange(len(nums)-1,-1,-1):
			if i + nums[i] >= destination:
				destination = i		
		return destination == 0		



		

mySolution = Solution()
print mySolution.canJump([2,3,1,1,4])
print mySolution.canJump([2,0])