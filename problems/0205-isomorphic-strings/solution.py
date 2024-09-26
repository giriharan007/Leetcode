class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # str1=[]
        # str2=[]
        # for i in s:
        #    str1.append(s.index(i))
        # for j in t:
        #     str2.append(t.index(j))
        # if(str1==str2):
        #     return True            
        # return False    

        if len(s)!=len(t):
            return False

        s_d={}
        t_d={}

        for i in range(len(s)):
            if s[i] not in s_d and t[i] not in t_d:
                s_d[s[i]]=t[i]
                t_d[t[i]]=s[i]

            elif s_d.get(s[i])!=t[i] and t_d.get(t[i])!=s[i]:
                return False
        return True               
