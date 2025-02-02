class Solution {
    public int sumOfSquares(int[] nums) {
        int pro=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
              if(n%(i+1)==0){
                pro=pro+(nums[i]*nums[i]);
              }
              else{
                continue;
              }

        }
        return pro;
    }
}
