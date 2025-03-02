class Solution(object):
    def isHappy(self, n):
        seen = set()  
        
        while n != 1:
            if n in seen: 
                return False
            seen.add(n)
            sum=0
            while(n!=0):
                rem=n%10
                n=n//10
                sum=sum+rem**2
            if(sum==1):
                return True
            else:
               n=sum
        return True    
    

        
