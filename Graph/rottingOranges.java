class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        boolean[][] vis=new boolean[n][m];
        int countfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
                if(grid[i][j]==1){
                    countfresh++;
                }
            }
        }
        int tm=0;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        int count=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+row[i];
                int ncol=c+col[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=true;
                    count++;
                }
            }
        }

        return countfresh!=count?-1:tm;

    }

}
class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}
