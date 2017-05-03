class Solution(object):
	def nextPermutation(self, nums):
		"""
		:type nums: List[int]
		:rtype: void Do not return anything, modify nums in-place instead.
		"""
		if len(nums) <2:
			return

		start = len(nums)-2
		while start >=0 and nums[start] >= nums[start+1]:
			start -= 1
		if start == -1:
			nums[::] = nums[::-1]
			return	

		tail = start + 1
		while nums[start] <= nums[tail]:
			if tail == len(nums)-1 or nums[start] >= nums[tail+1]:
				break
			tail += 1	

		nums[start],nums[tail] = nums[tail],nums[start]
		nums[::] = nums[:start+1] + nums[start+1:][::-1]











mySolution = Solution()

inputList = [1,2,3]
inputList2 = inputList[::-1]
print inputList

while inputList != inputList2:
	mySolution.nextPermutation(inputList)
	print inputList

	

		