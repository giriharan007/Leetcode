class Solution(object):
    def decompressRLElist(self, nums):
       ans=[]
       for i in range(0,len(nums),2):
        freq=nums[i]
        val=nums[i+1]
        while freq:
            ans.append(val)
            freq=freq-1
       return ans    
        
