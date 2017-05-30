import math
class Solution(object):
	def getPermutation(self, n, k):
		"""
		:type n: int
		:type k: int
		:rtype: str
		"""
		alphabet = range(1,n+1)
		result = ''
		k -= 1
		for i in xrange(n-1,-1,-1):
			index, k = divmod(k,math.factorial(i))
			result += str(alphabet.pop(index))
		return result	


'''		
		alphabet = [str(i) for i in range(1,n+1)]

		divisor = 1
		for i in range(2,n):
			divisor *= i	

		result = ""

		while k>0:
			group_num = k/divisor
			k %= divisor

			if k > 0:
				result += alphabet.pop(group_num)
			else:
				result += alphabet.pop(group_num-1) 
				alphabet.reverse()
				result += "".join(alphabet)
				break
			divisor /= len(alphabet)
		return result
'''				



				
		

mySolution = Solution()
n = 9	
for i in range(1,math.factorial(n)):
	print mySolution.getPermutation(n,i)	


	