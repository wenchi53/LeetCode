class Solution(object):
	def longestCommonPrefix(self, strs):
		"""
		:type strs: List[str]
		:rtype: str
		"""

		if(len(strs) == 0):
			return ""

		result = strs[0]
		for i in xrange(len(strs)):
			if result == strs[i]:
				continue
			else:
				while result != strs[i][:len(result)]:
					result = result[:-1]
					if not result:
						return result
		return result				

mySolution = Solution()
print mySolution.longestCommonPrefix(["aa","ab",])		
		