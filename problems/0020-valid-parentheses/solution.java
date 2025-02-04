class Solution {
    public boolean isValid(String s) {
      
        if (s.length() % 2 != 0) return false;

       
        Stack<Character> stc = new Stack<>();

      
        for (char ch : s.toCharArray()) {
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stc.push(ch);
            }
           
            else {
              
                if (stc.isEmpty()) return false;
                char top = stc.pop();
                
                if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }

       
        return stc.isEmpty();
    }
}

