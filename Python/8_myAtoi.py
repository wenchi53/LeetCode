class Solution:
	# @return an integer
	def myAtoi(self, strs):
		if len(strs) == 0:
			return 0
		s = list(strs.strip())
		sign = 1
		if s[0] in ["+","-"]:
			if s[0] == "-":
				sign = -1
			del s[0]
		result, i = 0,0
		while i < len(s) and s[i].isdigit():
			result = result*10 + ord(s[i]) - ord("0")
			i += 1
		return max(min(sign*result,2**31-1),-2**31)		



	
mySolution = Solution()
print mySolution.myAtoi("-12")		
		