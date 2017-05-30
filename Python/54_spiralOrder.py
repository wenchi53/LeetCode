class Solution(object):
	def spiralOrder(self, matrix):
		"""
		:type matrix: List[List[int]]
		:rtype: List[int]
		"""
		if not matrix or not matrix[0]:
			return []
		if len(matrix) == 1: return list(matrix[0])
		temp = list(matrix.pop(0))
		return temp + self.spiralOrder(zip(*matrix)[::-1])	


		'''	
		m,n = len(matrix),len(matrix[0])
		u,d,l,r = 0, m-1, 0, n-1
		result = []

		while u<d and l<r:
			result.extend(matrix[u][l:r])
			result.extend([matrix[j][r] for j in xrange(u,d)])
			result.extend(matrix[d][r:l:-1])
			result.extend([matrix[j][l] for j in xrange(d,u,-1)])
			u,d,l,r = u+1, d-1, l+1, r-1

		if l == r:
			result.extend([matrix[j][r] for j in xrange(u,d+1)])
		elif u == d:
			result.extend(matrix[u][l:r+1])
		return result
		'''			








mySolution = Solution()

print mySolution.spiralOrder([[1]])
print mySolution.spiralOrder([[3],[2]])

print mySolution.spiralOrder([[1,2,4,3,3,2]])
print mySolution.spiralOrder([[1,2,3],[4,5,6],[7,8,9]])

print mySolution.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]])		
		