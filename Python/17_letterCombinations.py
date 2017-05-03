class Solution(object):
	def letterCombinations(self, digits):
		"""
		:type digits: str
		:rtype: List[str]
		"""
		if digits == "":
			return []

		table = {"0":"","1":"","2":"abc","3":"def","4":"ghi","5":"jkl","6":"mno","7":"pqrs","8":"tuv","9":"wxyz"}
		result = list(table[digits[0]])
		
		for d in xrange(1,len(digits)):
			length = len(result)
			for r in xrange(length):
				for a in xrange(len(table[digits[d]])):
					result.append(result[r] + table[digits[d]][a])
			result[::] = result[length:]

		return result	
		
	


mySolution = Solution()
print mySolution.letterCombinations("")		


		