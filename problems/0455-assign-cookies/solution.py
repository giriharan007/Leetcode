class Solution(object):
    def findContentChildren(self, g, s):
        if(s==[] or g==[]):
            return 0
        s.sort()
        g.sort()
        c=0
        i=0
        j=0
        while((i<len(g)) and (j<len(s))):
            if(s[j]>=g[i]):
                c+=1
                i+=1
            j+=1       
        return c           
        
