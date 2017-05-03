class Solution(object):
	def longestPalindrome(self, s):
		if(len(s) == 1):
			return s
		returnS = ""
		for start in xrange(len(s)):
			maxLen = len(returnS)
			oddS = self.checkOdd(s,start)
			if(len(oddS) > maxLen):
				returnS = oddS
			evenS = self.checkEven(s,start)
			if(len(evenS) > maxLen):
				returnS = evenS
		return returnS		

	def checkOdd(self, s, start):
		begin, end = start, start
		while(begin > 0 and end < len(s)-1):
			if(s[begin-1] != s[end+1]):
				break
			else:
				begin -= 1
				end += 1
		return s[begin:end+1]

	def checkEven(self, s, start):
		if(start == len(s)-1):
			return ""
		tempS = s[0:start + 1] + "#" + s[start+1:]
		return self.checkOdd(tempS,start+1).replace("#", "")
	



	   
mySolution = Solution()

a = "dbammad"
print mySolution.longestPalindrome(a)
