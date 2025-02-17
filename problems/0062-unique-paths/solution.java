class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr=new int[m][n];
        arr[0][0]=1;
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
               if(arr[0][j]==0){
                   arr[0][j]=1;
               } 
               if(arr[i][0]==0){
                   arr[i][0]=1;
               }
               if(arr[i][j]==0){
                   arr[i][j]=arr[i-1][j]+arr[i][j-1];
               }
            }
        }
        return arr[m-1][n-1];
    }
}
