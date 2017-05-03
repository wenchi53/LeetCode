class Solution(object):
	def rotate(self, matrix):
		"""
		:type matrix: List[List[int]]
		:rtype: void Do not return anything, modify matrix in-place instead.
		"""
		matrix[::] =  zip(*matrix[::-1])



mySolution = Solution()
mySolution.rotate([[1,2],[3,4]])		
		

