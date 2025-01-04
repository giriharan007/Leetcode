from collections import Counter

class Solution(object):
    def countPalindromicSubsequence(self, s):
        sol = set()  
        left = set()
        right = Counter(s) 

        for m in s:  
            right[m] -= 1  

            for c in left:  
                if right[c] > 0:  
                    sol.add((m, c))  

            left.add(m)  
        return len(sol) 

