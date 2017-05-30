class Solution(object):
	def uniquePathsWithObstacles(self, obstacleGrid):
		"""
		:type obstacleGrid: List[List[int]]
		:rtype: int
		"""
		if not obstacleGrid or not obstacleGrid[0]:
			return 1

		m,n = len(obstacleGrid),len(obstacleGrid[0])

		table = [[0 for _ in range(n)] for _ in range(m)]

		for i in xrange(m):
			for j in xrange(n):
				if obstacleGrid[i][j] == 1:
					continue
				if [i,j] == [0,0]:
					table[i][j] = 1
					continue
				if i == 0:
					table[i][j] = table[i][j-1]
					continue
				if j == 0:
					table[i][j] = table[i-1][j]
					continue
				table[i][j] =  (table[i-1][j] + table[i][j-1])		
		return table[m-1][n-1]


def printTable(table):
	for t in xrange(len(table)):
		print table[t]	
	print "================"	

mysolution = Solution()
print mysolution.uniquePathsWithObstacles([[0,0,0], [0,1,0], [0,0,0]])