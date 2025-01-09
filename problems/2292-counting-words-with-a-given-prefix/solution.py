class Solution(object):
    def prefixCount(self, words, pref):
        res=0
        n=len(pref)

        for word in words:
            if word[:n]==pref:
                res+=1

        return res        
