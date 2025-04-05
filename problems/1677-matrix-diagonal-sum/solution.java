class Solution {
    public int diagonalSum(int[][] mat) {
        int j=0,k=mat.length-1;
        int sum1=0,sum2=0;

        for(int i=0;i<mat.length;i++){
            sum1+=mat[i][j];
            if(k==j){

            }
            else sum2+=mat[i][k];
            j++;
            k--;
        }
        return sum1+sum2;
    }
}
