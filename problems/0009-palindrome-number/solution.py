class Solution(object):
    def isPalindrome(self, x):
        rev = 0
        x1=x
        while(x1 > 0):
          rev = (rev * 10) + x1 % 10
          x1 = x1//10
        if rev==x:
            return True
        else:
            return False    
     
        
