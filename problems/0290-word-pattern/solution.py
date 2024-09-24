class Solution(object):
    def wordPattern(self, pattern, s):
       d=dict()
       st=s.split(' ')
       if len(pattern)!=len(st): return False
       if len(set(pattern))!=len(set(st)): return False
       for i in range(len(st)):
        if st[i] not in d:
            d[st[i]]=pattern[i]
        elif (d[st[i]]!=pattern[i]):
            return False     
       return True     
