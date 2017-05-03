class Solution(object):
	def findSubstring(self, s, words):
		result = []
		if not words or len(s) < len(words):
			return result	

		for i in xrange(len(s)):
			if self.checkSubstring(s,words,i):
				result.append(i)
		return result	

	def checkSubstring(self, s, words, start):
		w = words[::]
		block = len(w[0])
		result = []
		while start + block <= len(s):
			if s[start:start+block] in w:
				w.remove(s[start:start+block])
				if not w:
					return True				
			else:
				return False
			start += len(w[0])
		return False				


mySolution = Solution()
print mySolution.findSubstring("barfoothefoobarman",["foo", "bar"])


		