class Solution(object):
	def addBinary(self, a, b):
		"""
		:type a: str
		:type b: str
		:rtype: str
		"""
		if len(a) > len(b):
			l,s = list(a)[::-1],list(b)[::-1] + (["0"]*(len(a)-len(b)))
		else:
			l,s = list(b)[::-1],list(a)[::-1] + (["0"]*(len(b)-len(a)))

		result = [0]*(len(l))
		carry = "0"
		for i in range(len(l)):
			[carry,result[len(l) -1 -i]] = self.addSingle(l[i],s[i],carry)
		if carry == "1":
			return "".join([carry] + result)
		else:
			return "".join(result)


	def addSingle(self,a,b,carry):
		if [a,b,carry] in [["0","0","0"]]:
			return ["0","0"]
		if 	[a,b,carry] in [["1","0","0"],["0","1","0"],["0","0","1"]]:
			return ["0","1"]
		if 	[a,b,carry] in [["1","1","0"],["1","0","1"],["0","1","1"]]:
			return ["1","0"]
		if  [a,b,carry] in [["1","1","1"]]:
			return ["1","1"]


mySolution = Solution()
print mySolution.addBinary("101","11")
