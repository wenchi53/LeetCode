class Solution(object):
	def lengthOfLongestSubstring(self, s):

		maxValue = 0
		alphabet = []

		for i in xrange(len(s)):
			if(s[i] in alphabet):
				del alphabet[0:alphabet.index(s[i])+1]
			alphabet.append(s[i])
			if(len(alphabet) > maxValue):
				maxValue = len(alphabet)
		return maxValue


mySolution = Solution()
print mySolution.lengthOfLongestSubstring("bpfbhmipx")

'''
print mySolution.lengthOfLongestSubstring("dvdf")
print mySolution.lengthOfLongestSubstring("aab")
print mySolution.lengthOfLongestSubstring("abcabcbb")
print mySolution.lengthOfLongestSubstring("bbbbb")
print mySolution.lengthOfLongestSubstring("pwwkew")
'''