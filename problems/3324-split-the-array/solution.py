class Solution(object):
    def isPossibleToSplit(self, nums):
        nums.sort()
        nums1=[]
        nums2=[]
        for i in range(len(nums)):
            if(i%2==0):
                if nums[i] in nums1:
                    return False
                nums1.append(nums[i])
            else:
                if(nums[i] in nums2):
                    return False
                nums2.append(nums[i])
        print(nums1) 
        print(nums2)       

        return True           

        
