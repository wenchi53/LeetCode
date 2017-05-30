class Solution(object):
	def uniquePaths(self, m, n):
		"""
		:type m: int
		:type n: int
		:rtype: int
		"""
		if m == 1 or n == 1:
			return 1

		table = [[0]*n]*m
		table[0] = [1]*n

		for i in xrange(1,m):
			for j in xrange(n):
				if j == 0:
					table[i][j] = table[i-1][j]
					continue
				table[i][j] =  table[i-1][j] + table[i][j-1]	
		return table[m-1][n-1]


def printTable(table):
	for t in xrange(len(table)):
		print table[t]	
	print "================"	




mysolution = Solution()
print mysolution.uniquePaths(3,3)		
		