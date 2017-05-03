class Solution(object):
	def threeSum(self, nums):
		nums.sort()
		resultThree = []

		for i in xrange(len(nums)-2):
			if i > 0 and nums[i] == nums[i-1]:
				continue
			if nums[i] > 0:
				break	
			left, right = i+1, len(nums)-1
			while left < right:
				total = nums[i] + nums[left] + nums[right]
				if total < 0:
					left += 1
				elif total > 0:
					if right >= 0:
						right -= 1
					else:	
						break
				else:
					resultThree += [[nums[i],nums[left],nums[right]]]
					while left < right and nums[left] == nums[left + 1]:
						left += 1
					while left < right and nums[right] == nums[right-1]:
						right -= 1
					left += 1; right -= 1
		return resultThree							
	
mySolution = Solution()
solutionList = mySolution.threeSum([1,1,-1,-1,3])
for d in solutionList:
	print d
