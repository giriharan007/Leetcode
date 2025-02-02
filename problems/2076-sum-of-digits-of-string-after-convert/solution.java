class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        
       
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i) - 'a' + 1);
        }

        
        int sum = 0;
        for (char ch : str.toString().toCharArray()) {
            sum += ch - '0';  
        }

       
        while (k > 1) {  
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
            k--;
        }

        return sum;
    }
}

