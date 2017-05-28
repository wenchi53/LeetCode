import java.util.*;
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = m-1; int j = n-1; int k = m+n-1;
    	while(i > -1 && j > -1) nums1[k--] = (nums1[i] > nums2[j])? nums1[i--]:nums2[j--];
    	while(j > -1 ) nums1[k--] = nums2[j--];
        
    }


	
	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		int[] nums1 = {1,3,5,7,9,0,0,0,0,0,0};
		int[] nums2 = {2,4,6,8,10,12};

		mySolution.merge(nums1,5,nums2,6);	
		System.out.println(Arrays.toString(nums1));	
	}    
	

}
