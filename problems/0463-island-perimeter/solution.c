int islandPerimeter(int** grid, int gridSize, int* gridColSize) {
    int sum=0;
    for(int i=0;i<gridSize;i++){
        for(int j=0;j<gridColSize[i];j++){
            if(grid[i][j]==1){
                sum=sum+4;
            
           if (i > 0 && grid[i - 1][j] == 1){
                sum=sum-2;
            }
            if (j > 0 && grid[i][j - 1] == 1) {
                sum=sum-2;
            }
        }
    }
    }
    printf("%d",sum);
    return sum;
}
