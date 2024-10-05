class Solution(object):
    def maxArea(self, height):
        length=len(height)
        if(length==1):
            return height[0]
        max_val=0  
        l=0
        r=len(height)-1
        while(l<r):
            area=(r-l)*min(height[l],height[r])
            max_val=max(max_val,area)
            if(height[l]<height[r]):
                l+=1
            else:
                r-=1   
        return max_val       



