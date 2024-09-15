class Solution(object):
    def threeSum(self, nums):
        nums=sorted(nums)
        result=set()
        for i in range(len(nums)):
            if i>0 and nums[i]==nums[i-1]:
                continue
            l,r=i+1,len(nums)-1
            while l<r:
                val=nums[i]+nums[l]+nums[r]
                if(val<0):
                    l+=1
                elif(val>0):
                    r-=1
                else:
                    result.add((nums[i],nums[l],nums[r]))
                    l+=1
                    while l<r and nums[l]==nums[r]:
                        l+=1
        return result                


        
