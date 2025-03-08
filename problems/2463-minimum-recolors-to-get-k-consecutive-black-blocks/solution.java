class Solution {
    public int minimumRecolors(String blocks, int k) {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<=blocks.length()-k;i++){
          int count=0;
          for(int j=i;j<k+i;j++){
            if(blocks.charAt(j)=='W'){
               count++;
            }
          }
            min=Math.min(count,min);

            if(min==0)  return 0;
          
       }

       return min;
    }
}
