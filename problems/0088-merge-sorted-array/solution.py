class Solution(object):
    def merge(self, nums1, m, nums2, n):
            for i in range(0,n):
                 nums1[m+i]=nums2[i]
            return nums1.sort()     
