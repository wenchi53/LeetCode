class Solution(object):
	def generateMatrix(self, n):
		"""
		:type n: int
		:rtype: List[List[int]]
		"""

		result = [[0] * n for _ in range(n)]
		counter = 1
		l,r,u,d = 0,n-1,0,n-1

		while u<d and l<r:
			for i in range(l,r): 
				result[u][i] = counter 
				counter+=1
		
			for i in range(u,d): 
				result[i][r] = counter 
				counter+=1

			for i in range(r,l,-1): 
				result[d][i] = counter
				counter+=1

			for i in range(d,u,-1): 
				result[i][l] = counter
				counter+=1

			l,r,u,d = l+1, r-1, u+1, d-1
		if n%2:
			result[n/2][n/2] = n**2
		return result	
	

def printMatrix(matrix):
	for d in matrix:
		print d
	print "=============="	

mySolution = Solution()
result = mySolution.generateMatrix(3)
printMatrix(result)

		