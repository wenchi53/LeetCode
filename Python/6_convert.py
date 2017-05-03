class Solution(object):
	def convert(self, s, numRows):
		"""
		:type s: str
		:type numRows: int
		:rtype: str
		"""
		if len(s) < numRows or numRows == 1:
			return s

		returnS = ['']*numRows
		index, direction = 0, 1

		for i in s:
			returnS[index] += i
			index += direction
			if index == 0 or index == numRows-1:
				direction = -direction
		return ''.join(returnS)			









		
mySolution = Solution()
print mySolution.convert("PAYPALISHIRING", 3)
