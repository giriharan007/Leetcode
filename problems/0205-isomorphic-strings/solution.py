class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        str1=[]
        str2=[]
        for i in s:
           str1.append(s.index(i))
        for j in t:
            str2.append(t.index(j))
        if(str1==str2):
            return True            
        return False    
