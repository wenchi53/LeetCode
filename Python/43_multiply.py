class Solution(object):
	def multiply(self, num1, num2):
		"""
		:type num1: str
		:type num2: str
		:rtype: str
		"""
		product = [0]*(len(num1)+len(num2))
		pos = len(product) - 1

		for n1 in reversed(num1):
			tempPos = pos
			for n2 in reversed(num2):
				product[tempPos] += int(n1)*int(n2)
				product[tempPos-1] += product[tempPos]//10
				product[tempPos] %= 10
				tempPos -= 1
			pos -= 1	

		counter = 0
		while counter < len(product)-1 and product[counter] == 0:
			counter += 1
		return "".join(map(str,product[counter:]))		



mySolution = Solution()
print mySolution.multiply("9","9")