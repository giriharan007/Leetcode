class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] temp=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                    int row=i;
                    int col=j;
                    for(int k=0; k<matrix.length;k++) {
                        temp[k][j] = true;
                    }
                    
                    for(int k=0; k<matrix[0].length;k++) {
                        temp[i][k] = true;
                    }
                 }
            }
        }

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(temp[i][j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
