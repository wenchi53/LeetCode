class Solution(object):
	def reverse(self, x):
		"""
		:type x: int
		:rtype: int
		"""
		cmpResult = cmp(x,0)
		returnValue = int(str(cmpResult*x)[::-1])
		return cmpResult*(returnValue)*(returnValue < 2**31)

mySolution = Solution()
print mySolution.reverse(123456789)
print mySolution.reverse(-2147483648)