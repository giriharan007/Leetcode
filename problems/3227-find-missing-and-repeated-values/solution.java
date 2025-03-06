class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] ans=new int[2];
        int[] freq=new int [(n*n)+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0) ans[1]=i;

            else if(freq[i]==2)  ans[0]=i;
        }
        return ans;
    }
}
