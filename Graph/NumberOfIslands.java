class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    count++;
                    bfs(vis,grid,i,j);
                }
            }
        }
        return count;
    }

    public void bfs(boolean[][] vis,char[][] grid,int row,int col){
        vis[row][col]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Pair current = q.poll();
            int nrow = current.first;
            int ncol = current.second;

            for (int i = 0; i < 4; i++) {
                int r = nrow + dRow[i];
                int c = ncol + dCol[i];
                if (r >= 0 && r < n && c >= 0 && c < m &&
                    grid[r][c] == '1' && !vis[r][c]) {
                    vis[r][c] = true;
                    q.add(new Pair(r, c));
                }
            }
        }
    }

}
class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
