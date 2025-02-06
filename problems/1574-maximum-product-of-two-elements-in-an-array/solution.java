class Solution {
    public int maxProduct(int[] nums) {
       int maxpro=0;
        int pro=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
              pro=(nums[i]-1)*(nums[j]-1);
                if(maxpro<pro){
                    maxpro=pro;
                }
            }
        }
        return maxpro;
    }
}
