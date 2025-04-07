class Solution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> l1 = new ArrayList<>();  
        List<Integer> temp = new ArrayList<>();
        helper(nums, 0, l1, temp);  
        return l1;    
        }

    public  List<List<Integer>> helper(int[] nums,int indx,List l1,List temp){
            l1.add(new ArrayList<>(temp));

           for(int i=indx;i<nums.length;i++){
              temp.add(nums[i]);
              helper(nums,i+1,l1,temp);
              temp.remove(temp.size()-1); 
           }
           return l1;
    }
}
