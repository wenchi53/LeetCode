class Solution(object):
	def searchRange(self, nums, target):
		"""
		:type nums: List[int]
		:type target: int
		:rtype: List[int]
		"""
		if target not in nums:
			return [-1,-1]

		l1,l2,h1,h2 = 0, 0, len(nums)-1, len(nums)-1

		while l1 < h1:
			mid = (l1+h1)//2
			if nums[mid] >= target:
				h1 = mid
			else:
				l1 = mid + 1

		while l2 < h2:
			mid = (l2+h2)//2
			if l2 != h2:
				mid += 1
			if nums[mid] <= target:
				l2 = mid
			else:
				h2 = mid-1

		return [l1,h2]		





		
mySolutin = Solution()
print mySolutin.searchRange([5,7,7,8,8,10],8)
		