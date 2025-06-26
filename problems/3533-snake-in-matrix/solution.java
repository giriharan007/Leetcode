class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] ans=new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=count;
                count++;
            }
        }
        int position=0;
        int i=0;
        int j=0;
        for(int k=0;k<commands.size();k++){
            String cmd=commands.get(k); 
            if(i!=0 && cmd.equals("UP")) position=ans[--i][j];
            else if(i!=n-1 && cmd.equals("DOWN")) position=ans[++i][j];
            else if(j!=0 && cmd.equals("LEFT")) position=ans[i][--j];
            else if(j!=n-1 && cmd.equals("RIGHT")) position=ans[i][++j];   
        }
        return position;
    }
}
