class Solution(object):
	def maxArea(self, height):

		L, H, width, maxValue = 0, len(height)-1, len(height)-1, 0

		for w in xrange(width,0,-1):
			if(height[L] < height[H]):
				maxValue, L = max(maxValue, height[L]*w), L + 1
			else:
				maxValue, H = max(maxValue, height[H]*w), H - 1
		return maxValue		


mySolution = Solution()
print mySolution.maxArea([1,2])