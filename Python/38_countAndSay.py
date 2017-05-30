class Solution(object):
	def countAndSay(self, n):
		"""
		:type n: int
		:rtype: str
		"""
		out = "1"
		for _ in xrange(n-1):
			out = self.strConver(out)
		return out	


	def strConver(sef,strs):
		strs += "a"
		currentStr,strCount,result = "",0,""

		for i in xrange(len(strs)):
			if strs[i] == currentStr:
				strCount += 1
			else:	
				result += str(strCount) +  currentStr
				currentStr,strCount = strs[i],1
		return result[1:]		

mySolutio = Solution()
for i in xrange(1,10):
	print mySolutio.countAndSay(i)		
		