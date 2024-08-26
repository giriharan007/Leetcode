class Solution(object):
    def combinationSum(self, candidates, target):
        def backtrack(remaining, start, path, results):
            if remaining == 0:
                results.append(list(path))
                return
            elif remaining < 0:
                return
            for i in range(start, len(candidates)):
                path.append(candidates[i])
                backtrack(remaining - candidates[i], i, path, results)
                path.pop()
        results = []
        candidates.sort()
        backtrack(target, 0, [], results)
        return results

        
