class Solution(object):
    def isValid(self, s):
        if(len(s)%2!=0):
            return False
        stack=[]    
        for char in s:
            if(char=='(' or char=='{' or char=='['):
                stack.append(char)
            else:
                if not stack:return False
                top=stack.pop()
                if(top=='(' and char!=')') or (top=='{' and char!='}') or (top=='[' and char!=']'):
                    return False
        return not stack            


