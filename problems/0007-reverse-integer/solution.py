class Solution(object):
    def reverse(self, x):
        
        rev=0
        flag=0
        if x<0:
            flag=1
            x=abs(x)
        x1=x
        while (x>0):
            if x==0:
                break
            else:
                rev = (rev * 10) + x % 10
                x = x//10
            
        if flag==1:
            rev=rev*-1

        if rev > 2**31 - 1 or rev < -2**31:
            return 0

        return rev   
