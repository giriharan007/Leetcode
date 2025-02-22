class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        int n=nums.length;
     
        HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
          
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                l1.add(entry.getKey());  
            }
        }
        
        return l1;
    }
}
