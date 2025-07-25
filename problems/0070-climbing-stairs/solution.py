class Solution(object):
    def climbStairs(self, n):
        if n == 1:
            return 1

        one_before = 1
        two_before = 1
        total = 0

        for i in range(n-1):
            total = one_before + two_before
            two_before = one_before
            one_before = total

        return total
