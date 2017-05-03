class Solution(object):
	def romanToInt(self, s):

		table = {"M":1000,"D":500,"C":100,"L":50,"X":10,"V":5,"I":1,}
		result = [0]*len(s)

		start = table["I"]
		for i in xrange(len(s)-1,-1,-1):
			now = table[s[i]]
			if now < start:
				result[i] = -now
			else:
				result[i] = now
			start = now	

		return sum(result)			


mySolution = Solution()
print mySolution.romanToInt("MCDXXX")		
		