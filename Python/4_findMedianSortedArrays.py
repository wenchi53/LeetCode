class Solution(object):
	def findMedianSortedArrays(self, nums1, nums2):
		totalNums = nums1 + nums2
		return self.quicksort(totalNums,0,len(totalNums)-1)

	def quicksort(self, myList, start, end):
		if(start < end):
			# partition the list
			pivot = self.partition(myList, start, end)
			print myList
			# sort both halves

			if((end - start) == 1):
				return (myList[0] + myList[1])/2.0
			if((end - start) == 0):
				return myList[0]

			if((pivot-1-start) > (end - pivot+1)):
				self.quicksort(myList, start, pivot)
			else:
				self.quicksort(myList, pivot, end)

	def partition(self, myList, start, end):
		pivot = myList[start]
		left = start+1
		right = end
		done = False
		while(not done):
			while(left <= right and myList[left] <= pivot):
				left = left + 1
			while(myList[right] >= pivot and right >=left):
				right = right -1
			if(right < left):
				done= True
			else:
				# swap places
				temp=myList[left]
				myList[left]=myList[right]
				myList[right]=temp
		# swap start with myList[right]
		temp=myList[start]
		myList[start]=myList[right]
		myList[right]=temp
		return right



nums1 = [3, 1]
nums2 = [2, 4]

mySolution = Solution()
print mySolution.findMedianSortedArrays(nums1,nums2)