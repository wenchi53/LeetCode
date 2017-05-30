class Solution(object):
	def strStr(self, haystack, needle):
		"""
		:type haystack: str
		:type needle: str
		:rtype: int
		"""
		for i in xrange(1+ len(haystack) - len(needle)):
			if haystack[i:i+len(needle)] == needle: return i
		return -1		



mySolution = Solution()
print mySolution.strStr("mississippi","pi")