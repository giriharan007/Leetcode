class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_limit=0;
         int min_limit=0;
         int max=0;
         int min=0;
  
        for(int val:nums){
            max_limit+= val;
            min_limit += val;

            max = Math.max(max, max_limit);
            min = Math.min(min, min_limit);

            if(max_limit < 0) max_limit = 0;
            if(min_limit > 0) min_limit = 0;
        }

        return Math.max(max, Math.abs(min));
    }
}
