 class Solution(object):
    def twoSum(self, nums, target):
    	buff = {}
    	for i in xrange(len(nums)):
    		if nums[i] in buff:
    			return [buff[nums[i]],i]
    		else:
    			buff[target - nums[i]] = i

my_solution = Solution()
print my_solution.twoSum([2, 13, 11, 15],9)

