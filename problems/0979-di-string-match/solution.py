class Solution(object):
    def diStringMatch(self, s):
        I=0
        D=len(s)
        perm=[]
        for i in range(0,len(s)):
            if(s[i]=="I"):
                perm.append(I)
                I+=1
            if(s[i]=="D"):
                perm.append(D)
                D-=1
        for i in range(D+1):
            if i not in perm:
                perm.append(i)
        return perm            
        
