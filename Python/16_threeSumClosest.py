class Solution(object):
	def threeSumClosest(self, nums, target):

		nums.sort()
		result = sum(nums[:3])

		for i in xrange(len(nums)-2):
			if i>0 and nums[i] == nums[i-1]:
				continue
			left, right = i+1, len(nums)-1
			current = abs(target - result)
			while left < right:
				total = target - sum([nums[i],nums[left],nums[right]])

				if total == 0:
					target

				if current > abs(total):
					result = sum([nums[i],nums[left],nums[right]])
					current = abs(target - result)

				if total > 0:
					left += 1
				else:
					right -= 1
			
		return result			




mySolution = Solution()
print mySolution.threeSumClosest([1,1,-1,-1,3],3)		
		