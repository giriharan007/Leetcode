class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
       int count=0;
       int prev=intervals[0][1];
       for(int i=1;i<intervals.length;i++){
           if(intervals[i][0]<prev){
            count++;
           }
           else{
            prev=intervals[i][1];
           }
       } 
       
       return count;
    }
}
