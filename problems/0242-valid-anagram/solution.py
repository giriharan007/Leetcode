class Solution(object):
   def isAnagram(self, s, t):
        t=Counter(t)
        s=Counter(s)
        return t==s 
        
