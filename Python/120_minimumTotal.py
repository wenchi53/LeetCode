class Solution(object):
	def minimumTotal(self, triangle):
		pathTotal = [0]*(len(triangle)+1)
		for layer in triangle[::-1]:
			for i in xrange(len(layer)):
				pathTotal[i] = layer[i] + min(pathTotal[i],pathTotal[i+1])
		return pathTotal[0]		

		
mySolution = Solution()
print mySolution.minimumTotal([ [2], [3,4], [6,5,7], [4,1,8,3] ])
