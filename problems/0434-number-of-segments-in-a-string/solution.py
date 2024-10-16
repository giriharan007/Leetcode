class Solution(object):
    def countSegments(self, s):
        c=0
        s=s.split()
        for i in s:
            c+=1
        return c    
        
