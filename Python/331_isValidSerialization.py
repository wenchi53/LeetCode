class Solution(object):
	def isValidSerialization(self, preorder):
		preorderSplit = preorder.split(",")
		numberOfHash = 0;
		numberOfCount = 1;

		for i in xrange(len(preorderSplit)):

			if(preorderSplit[i] == "#"):
				numberOfHash += 1
				if(numberOfHash == numberOfCount):
					return i+1 == len(preorderSplit)
			else:
				numberOfCount += 1
		return 	numberOfHash == numberOfCount


mySolution = Solution()
print mySolution.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#")
print mySolution.isValidSerialization("1,#,#,1")
