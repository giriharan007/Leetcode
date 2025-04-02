class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            int sum=num+diff;
            if (set.contains(sum) && set.contains(sum+diff)) {
                count++;
            }
        }
        
        return count;
    }
}

