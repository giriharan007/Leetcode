
class Solution(object):
    def removeAnagrams(self, words):
        result=[]
        prev=None

        for word in words:
            sorted_word=sorted(word)

            if sorted_word!=prev:
                result.append(word)
                prev=sorted_word
            

        return result
