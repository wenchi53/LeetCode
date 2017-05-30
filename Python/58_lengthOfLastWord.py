class Solution(object):
	def lengthOfLastWord(self, s):
		"""
		:type s: str
		:rtype: int
		"""
		sp = s.split(" ")
		for index in xrange(len(sp)-1,-1,-1):
			if sp[index] != "":
				return len(sp[index])
		return 0

mySolution = Solution()
print mySolution.lengthOfLastWord("a ")
		