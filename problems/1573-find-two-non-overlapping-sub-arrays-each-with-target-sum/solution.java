class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int presum = 0;
        
        int len = arr.length;        
        int[] minLenAtcurrentElement = new int[len];
        Arrays.fill(minLenAtcurrentElement, Integer.MAX_VALUE);
        
        int ans = Integer.MAX_VALUE;
        int localMin = Integer.MAX_VALUE;
               
        for(int i = 0; i<len; i++)
        {
            presum += arr[i];            
            if(map.containsKey(presum - target))
            {
                int leftboard = map.get(presum - target);
                if(leftboard>-1 && minLenAtcurrentElement[leftboard] != Integer.MAX_VALUE)
                {
                    ans = Math.min(ans, i - map.get(presum-target) + minLenAtcurrentElement[leftboard]);                                         
                }
                localMin = Math.min(localMin, i-leftboard);
            }
            minLenAtcurrentElement[i] = localMin;
            map.put(presum, i);
        }
        
        return ans == Integer.MAX_VALUE? -1: ans;
    }
}
