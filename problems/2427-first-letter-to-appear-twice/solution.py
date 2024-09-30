class Solution(object):
    def repeatedCharacter(self, s):
        d=set() 
        for i in range(len(s)):
            if s[i] in d:
                return s[i]
            else:
                d.add(s[i])
        return None           
        
        
