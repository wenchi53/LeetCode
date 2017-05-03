class Solution(object):
	def isPalindrome(self, x):
		if x < 0:
			return False
		strX = str(x)
		half = len(strX)//2
		mod = len(strX)%2
		return strX[:half] == strX[half + mod:][::-1]



mySolution = Solution()
print mySolution.isPalindrome(10021001)