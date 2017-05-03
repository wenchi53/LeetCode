class Solution(object):
	def fourSum(self, nums, target):

		nums.sort()
		resultFour = []

		for i in xrange(len(nums)-3):
			if i>0 and nums[i] == nums[i-1]:
				continue
			fourList = self.threeSum(nums[i+1:],target - nums[i])
			for j in xrange(len(fourList)):
				resultFour.append(nums[i:i+1] + fourList[j])
		return resultFour



	def threeSum(self, nums, target):
		resultThree = []

		for i in xrange(len(nums)-2):
			if i > 0 and nums[i] == nums[i-1]:
				continue	
			left, right = i+1, len(nums)-1
			while left < right:
				total = nums[i] + nums[left] + nums[right]
				if total < target:
					left += 1
				elif total > target:
					right -= 1
				else:
					resultThree += [[nums[i],nums[left],nums[right]]]
					while left < right and nums[left] == nums[left + 1]:
						left += 1
					while left < right and nums[right] == nums[right-1]:
						right -= 1
					left += 1; right -= 1
		return resultThree	



mySolution = Solution()
result = mySolution.fourSum([1,-2,-5,-4,-3,3,3,5],-11)
for d in result:
	print d
		