class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        index={}
        for i,num in enumerate(nums):
            if(num in index and i-index[num]<=k):
                return True
            index[num]=i    
        return False        
