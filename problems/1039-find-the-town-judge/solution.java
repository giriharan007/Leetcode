class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCounts = new int[n + 1];
        int[] trustedByCounts = new int[n + 1];
        for (int[] t : trust) {
            trustCounts[t[0]]++;      
            trustedByCounts[t[1]]++; 
        }      
        for (int i=1;i<=n;i++) {
            if (trustCounts[i]==0&&trustedByCounts[i]==n-1) {
                return i;  
            }
        }
        
        return -1;
    }
}

