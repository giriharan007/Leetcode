class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long[] pre=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            pre[i]=sum;
        }
        int res=0;
        for(int i=0;i<n-1;i++){
            if(pre[i]>=sum-pre[i]){
                res++;
            }
        }
        return res;
    }
}
