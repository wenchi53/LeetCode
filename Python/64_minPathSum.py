class Solution(object):
	def minPathSum(self, grid):
		m,n = len(grid),len(grid[0])
		for i in range(1,n):
			grid[0][i] += grid[0][i-1]
		for i in range(1,m):
			grid[i][0] += grid[i-1][0]  
		for i in range(1,n):
			for j in range(1,m):
				grid[j][i] += min(grid[j-1][i],grid[j][i-1]) 
		return grid[m-1][n-1]

def printMatrix(matrix):
	print "=========="
	for m in matrix:
		print m	
	print "++++++++++"	

mySolution = Solution()
print mySolution.minPathSum([[0,1],[1,0]])		