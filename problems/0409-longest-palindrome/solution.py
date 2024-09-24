class Solution(object):
    def longestPalindrome(self, s):
       d=Counter(s)
       odd=0
       freq_even=0
       for count in d.values():
        if count//2>0:
            freq_even+=(count//2)*2
        if count%2==1:
            odd=1
       return odd+freq_even           
