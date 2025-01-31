class Solution {
    public int myAtoi(String s) {
        StringBuilder str=new StringBuilder();
        int c=0;
        int num=0;
         s = s.trim();
         if (s.isEmpty()) {
            return 0;
        }
          int i = 0;
        if (s.charAt(i) == '-') {
            str.append(s.charAt(i));
            i++;
        } else if (s.charAt(i) == '+') {
            i++;  
        }

         while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            str.append(s.charAt(i));
            i++;
        }

        if (str.length() == 0 || (str.length() == 1 && str.charAt(0) == '-' || str.charAt(0) == '+')) {
            return 0;
        }

                try {
            num = Integer.parseInt(str.toString());
        } catch (NumberFormatException e) {
           
            if (str.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        return num;

    }
}
