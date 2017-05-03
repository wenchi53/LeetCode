class Solution(object):
	def groupAnagrams(self, strs):
		"""
		:type strs: List[str]
		:rtype: List[List[str]]
		"""
		table = {}
		result = []
		tablePosition = 0
		for i in xrange(len(strs)):
			sortStr = "".join(sorted(strs[i]))
			if sortStr not in table:
				table[sortStr] = tablePosition
				tablePosition += 1
				result.append([strs[i]])
			else:
				result[table[sortStr]].append(strs[i])
		return result

mySolution = Solution()
result = mySolution.groupAnagrams(["",""])

for d in result:
	print d					
