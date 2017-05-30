class Solution(object):
	def plusOne(self, digits):
		"""
		:type digits: List[int]
		:rtype: List[int]
		"""
		return map(int,list(str(int("".join(map(str,digits)))+1)))

mySolution = Solution()
print mySolution.plusOne([1,2,3])	