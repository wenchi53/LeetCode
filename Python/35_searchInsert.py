class Solution(object):
	def searchInsert(self, nums, target):
		"""
		:type nums: List[int]
		:type target: int
		:rtype: int
		"""
		l,h = 0, len(nums)-1
		while h >= l:
			mid = (l+h)//2
			if nums[mid] < target:
				l = mid + 1
			elif nums[mid] > target:
				h = mid -1
			else:
				return mid				
		return l

mySolution = Solution()
print mySolution.searchInsert([1,3,5,6], 5)
print mySolution.searchInsert([1,3,5,6], 2)
print mySolution.searchInsert([1,3,5,6], 7)
print mySolution.searchInsert([1,3,5,6], 0)