class Solution(object):
    def intersection(self, nums1, nums2):
        intersection=set()
        for num in nums1:
            if num in nums2:
                intersection.add(num)
        return intersection        
        
