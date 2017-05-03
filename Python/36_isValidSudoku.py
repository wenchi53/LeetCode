class Solution(object):
	def isValidSudoku(self, board):
		"""
		:type board: List[List[str]]
		:rtype: bool
		"""
		table = set()
		for i in xrange(0,9):
			for j in xrange(0,9):
				if board[i][j] != ".":
					if (i,board[i][j]) in table or (board[i][j],j) in table or (i//3,j//3,board[i][j]) in table:
						return False
					table.add((i,board[i][j]))
					table.add((board[i][j],j))
					table.add((i//3,j//3,board[i][j]))
		return True			
						

mySolution = Solution()
print mySolution.isValidSudoku([".87654321","2........","3........","4........","5........","6........","7........","8........","9........"])		