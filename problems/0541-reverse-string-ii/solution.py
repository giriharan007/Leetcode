class Solution(object):
    def reverseStr(self, s, k):
        s=list(s)
        for i in range (0,len(s),k*2):
            start=i
            end=min(i+k-1,len(s)-1)
            while start<end:
                s[start],s[end]=s[end],s[start]
                start+=1
                end-=1
        return ''.join(s)        
        return s    
        
        
