class Solution {
    public int findNumbers(int[] nums) {
       int evencount=0;
       for(int num:nums){
          int count=digitCounts(num);
          if(count%2==0) evencount++;
       }
       return evencount;
    }

    int digitCounts(int num){
        int c=0;
        if(num<0){
            num=num*(-1);
        }

        while(num!=0){
            int digit = num%10;
            num=num/10;
            c++;
        }
        return c;
    }
}
