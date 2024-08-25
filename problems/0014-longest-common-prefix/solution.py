class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        prefix = strs[0]
        for string in strs[1:]:
            i=0
            while i<len(prefix) and i<len(string):
                if (prefix[i]!=string[i]):
                    prefix=prefix[0:i:]
                    break
                i=i+1
            else:
                prefix=prefix[:i]
    
        return prefix        

            

