class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        s=s.split()
        s.reverse()
        ans=' '.join(s)
        return ans
