class Solution(object):
	def myPow(self, x, n):
		"""
		:type x: float
		:type n: int
		:rtype: float
		"""

		binN = bin(n)[2:]

		temp,result = x,1
		for i in range(len(binN)-1,-1,-1):
			if binN[i] == "1":
				result *= temp
			temp *= temp
		if n >= 0:
			return result
		else:	
			return 1/result
					

mySolution = Solution()
print mySolution.myPow(34.00515,-3)		
		