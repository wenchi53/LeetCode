class Solution(object):
	def search(self, nums, target):
		"""
		:type nums: List[int]
		:type target: int
		:rtype: int
		"""
		if not nums:
			return -1

		left, right = 0,len(nums)-1
		while right - left > 1:
			if target in [nums[left],nums[right]]:
				return left*(target==nums[left]) + right*(target==nums[right])
			mid = (left+right)//2

			if nums[left] < nums[right]:
				if nums[mid] > target:
					right = mid
				else:
					left = mid
			else:
				if (target < nums[mid] and (target > nums[left] or nums[left] > nums[mid])) or (target > nums[mid] and nums[mid] < nums[left] and target > nums[right]):
					right = mid
				else:
					left = mid					

		if target in [nums[left],nums[right]]:
			return left*(target==nums[left]) + right*(target==nums[right])
		else:
			return -1

mySolution = Solution()

inputString = [5,1,2,3,4,5]

for _ in xrange(len(inputString)):
	print mySolution.search(inputString,1)
	inputString[::] = inputString[len(inputString)-1:]+inputString[:len(inputString)-1]

