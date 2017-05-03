class Solution(object):
	def removeElement(self, nums, val):
		"""
		:type nums: List[int]
		:type val: int
		:rtype: int
		"""
		lenNums = len(nums)
		valCounter = 0
		for i in xrange(lenNums):
			if nums[i] == val:
				while nums[i+valCounter] == val:
					valCounter += 1
					if i+valCounter > lenNums-1:
						return lenNums - valCounter
				nums[i], nums[i+valCounter] = nums[i+valCounter], val
				valCounter -= 1		
		return lenNums - valCounter		



mySolution = Solution()
print mySolution.removeElement([2],3)
print mySolution.removeElement([4,5],4) 
		