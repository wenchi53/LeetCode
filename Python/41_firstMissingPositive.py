class Solution(object):
	def firstMissingPositive(self, nums):
		"""
		:type nums: List[int]
		:rtype: int
		"""
		nums.append([0])
		n = len(nums)

		for i in range(n):
			if nums[i] >= n or nums[i] < 0:
				nums[i] = 0
		for i in range(n):
			nums[nums[i]%n] += n
		for i in range(n):
			if nums[i]//n == 0:
				return i
		return n
		
mySolution = Solution()
print mySolution.firstMissingPositive([1,2,0])		