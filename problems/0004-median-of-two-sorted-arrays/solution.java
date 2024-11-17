class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a;
       int[] mergedArray = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2))
                                     .toArray();
        Arrays.sort(mergedArray);
        int n=mergedArray.length/2;
        if(mergedArray.length%2==1){
            a=mergedArray[n];
        }     
        else{
            a=(mergedArray[n]+mergedArray[n-1])/2.0;
          
    
        }
        return a;                        
    }
}
