class Solution {
    public String convertToBase7(int num) {
        int temp=num,rem=0;

        StringBuilder sb=new StringBuilder();
         num = Math.abs(num);

        if (num == 0) {
            return "0"; 
        }
        
        while(num>0){
             rem=num%7;
             sb.append(rem);
             num=num/7;

        }
        if(temp<0) sb.append("-");

        sb.reverse();
        return sb.toString();
    }
}
