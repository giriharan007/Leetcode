class Solution(object):
    def searchInsert(self, nums, target):
        if target in nums:
            a=nums.index(target)
            return a
        else:
            a=nums.append(target)  
            a=nums.sort()
            a=nums.index(target)
            return a

        
