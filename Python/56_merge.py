class Interval(object):
	def __init__(self, s=0, e=0):
		self.start = s
		self.end = e

class Solution(object):
	def merge(self, intervals):
		"""
		:type intervals: List[Interval]
		:rtype: List[Interval]
		"""
		if len(intervals) < 2:
			return intervals

		return self.mergeArray(self.merge(intervals[:len(intervals)//2]),self.merge(intervals[len(intervals)//2:]))


	def mergeArray(self,left,right):
		if not left or not right:
			return left or right
		result = []
		i,j = 0,0
		while i < len(left) or j < len(right):
			if i < len(left) and (j >= len(right) or left[i].start <= right[j].start):
				if not result or result[len(result)-1].end < left[i].start:
					result.append(left[i])
				else:
					result[len(result)-1] = Interval(min(left[i].start,result[len(result)-1].start),max(left[i].end,result[len(result)-1].end))
				i += 1
			elif j < len(right):
				if not result or result[len(result)-1].end < right[j].start:
					result.append(right[j])
				else:			
					result[len(result)-1] = Interval(min(right[j].start,result[len(result)-1].start),max(right[j].end,result[len(result)-1].end))
				j += 1	
		return result			



inArray = [[1,4],[0,0]]
inter = []

for d in inArray:
	inter.append(Interval(d[0],d[1]))

mySolution = Solution()
result = mySolution.merge(inter)
for i in result:
	print [i.start,i.end]	