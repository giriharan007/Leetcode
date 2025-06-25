class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int top=0;
        // int bot=matrix.length-1;
       /* while (top<=bot) {
            int mid = (top+bot)/2;
            if(matrix[mid][0]<target && matrix[mid][matrix[0].length-1]>target)
            int left=0;
            int right=matrix[0].length-1;
            int rowmid=(left+right)/2
            while(left<right){
                if(matrix[mid][rowmid]==target) return true;
                else if(matrix[mid][rowmid]<target) left=rowmid+1;
                else right=rowmid-1;
            }
            } 
            else if (matrix[mid][0]>target) {
                bot=mid-1;
            } else {
                top=mid+1;
            }*/
            int row=0;
            int col=matrix[0].length-1;
            while(row<matrix.length && col>=0){
                if(matrix[row][col]==target)  return true;
                else if(matrix[row][col]>target) col--;
                else row++;
            }
        return false;      
    }
}
