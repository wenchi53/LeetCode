class Solution(object):
	def longestPalindrome(self, s):
		
		alphabet = []
		palindromeCounter = 0
		for i in xrange(len(s)):
			if(s[i] in alphabet):
				alphabet.remove(s[i])
				palindromeCounter += 2
			else:
				alphabet.append(s[i])
		if(alphabet):
			palindromeCounter += 1

		return palindromeCounter	



mySolution = Solution()
print mySolution.longestPalindrome("abccccdd")