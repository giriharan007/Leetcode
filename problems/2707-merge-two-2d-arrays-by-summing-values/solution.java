class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       List<int[]> l=new ArrayList<>();
       int n=nums1.length;
       int n1=nums2.length;
      int  i=0;
      int j=0;
       while(i<n && j<n1){
         if( nums1[i][0]==nums2[j][0]){
             l.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
             i++;
             j++;
         }
         else if(nums1[i][0]<nums2[j][0]){
            l.add(nums1[i]);
            i++;
         }
           else {
            l.add(nums2[j]);
            j++;
         }

       } 
        while (i < n) {
            l.add(nums1[i]);
            i++;
        }
        while (j < n1) {
            l.add(nums2[j]);
            j++;
        }

       return l.toArray(new int[l.size()][]);
    }
}
