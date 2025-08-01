class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            if(i==0 || i==m-1){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==1  && !vis[i][j]){
                        helper(i,j,grid,vis);
                    }
                }
            }else{
                if(grid[i][0]==1  && !vis[i][0]){
                    helper(i,0,grid,vis);
                }
                if(grid[i][n-1]==1  && !vis[i][n-1]){
                    helper(i,n-1,grid,vis);
                }
            }
        }

        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    void helper(int r,int c,int[][] grid,boolean[][] vis){
        vis[r][c]=true;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=r+row[i];
            int ncol=c+col[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && !vis[nrow][ncol] && grid[nrow][ncol]==1){
                helper(nrow,ncol,grid,vis);
            }
        }
    }
}
