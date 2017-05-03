class Solution(object):
	def divide(self, dividend, divisor):

		positive = (dividend > 0) == (divisor > 0)
		dividend, divisor = abs(dividend), abs(divisor)
		quotient = 0

		carry = 1
		tempDivisor = divisor
		while(dividend >= tempDivisor<<1):
			tempDivisor <<= 1
			carry <<= 1


		while(dividend >= tempDivisor and tempDivisor >= divisor):
			dividend -= tempDivisor
			quotient += carry

			while(dividend < tempDivisor and tempDivisor >= 1):
				tempDivisor >>= 1
				carry >>=1
		if(positive == 0):
			quotient = -quotient		

		return min(max(-2147483648, quotient), 2147483647)

			

			
mySolution = Solution()
print mySolution.divide(-2147483648,1)