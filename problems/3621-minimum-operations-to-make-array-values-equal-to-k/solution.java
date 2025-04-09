class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer>set=new HashSet();
        for(int n:nums){ 
         if(n>k) set.add(n);
         else if(n<k) return -1;
        }
        return set.size();
    }
}
