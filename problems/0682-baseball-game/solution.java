class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (op.equals("D")) {
                
                if (!st.isEmpty()) {
                    st.push(st.peek() * 2);
               
                }
            } else if (op.equals("+")) {
                
                int last =  st.pop();
                int secondLast =  st.peek();
                st.push(last); 
                st.push(last + secondLast);
            } else {
               
                st.push(Integer.parseInt(op));
            }
        }

      
        for (int score : st) {
            sum += score;
        }
        return sum;
    }
}
