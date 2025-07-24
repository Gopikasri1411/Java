class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inicolor=image[sr][sc];
        int[][] ans=image;
        int[] delrow={-1,1,0,0};
        int[] delcol={0,0,-1,1};
        dfs(ans,image,delrow,delcol,sr,sc,color,inicolor);
        return ans;
    }
    void dfs(int[][] ans,int[][] image,int[] delrow,int[] delcol,int sr,int sc,int color,int inicolor){
        ans[sr][sc]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=sr+delrow[i];
            int ncol=sc+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=color){
                dfs(ans,image,delrow,delcol,nrow,ncol,color,inicolor);
            }
        }
    }
    }
