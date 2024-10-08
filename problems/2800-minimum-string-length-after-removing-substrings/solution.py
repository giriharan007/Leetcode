class Solution(object):
    def minLength(self, s):
        stack=[]
        for i in s:
            if(i=="B" and stack and stack[-1]=="A") or (i=="D" and stack and stack[-1]=="C"):
                stack.pop()
            else:
                stack.append(i)
        return len(stack)            
         



        
