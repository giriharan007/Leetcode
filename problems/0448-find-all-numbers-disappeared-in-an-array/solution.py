class Solution(object):
    def findDisappearedNumbers(self, nums):
        for i in range(len(nums)):
            indx=abs(nums[i])-1
            nums[indx]=-abs(nums[indx])
        arr=[]    
        for i in range(len(nums)):
            if nums[i]>0:
                arr.append(i+1)
        return arr        

