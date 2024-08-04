class Solution(object):
    def mySqrt(self, x):
       
       if x==1:
        return x
       elif x==0:
        return x  

       else: 
        start=1
        end=x
        while(start<=end):
            mid=start+(end-start)//2
            if((mid*mid)==x):
                return int(mid)
            elif(x<(mid*mid)):
                end=mid-1
            else:
                start=mid+1

        return end
