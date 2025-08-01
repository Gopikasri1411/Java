class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        Set<List<String>> set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    List<String> list=new ArrayList<>();
                    helper(i,j,grid,vis,list,new Node(i,j));
                    set.add(list);
                }
            }
        }
        
        return set.size();
    }
    
    private String toString(int r,int c){
        return Integer.toString(r) + " "+ Integer.toString(c);
    }
    
    void helper(int r,int c,int[][] grid,boolean[][] vis,List<String> list,Node base){
        vis[r][c]=true;
        list.add(toString(r-base.row,c-base.col));
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=r+row[i];
            int ncol=c+col[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1 && !vis[nrow][ncol]){
                helper(nrow,ncol,grid,vis,list,base);
            }
            
        }
    }
}
class Node{
    int row;
    int col;
    public Node(int row,int col){
        this.row=row;
        this.col=col;
    }
}
