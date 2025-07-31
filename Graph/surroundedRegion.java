class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            if(i==0 || i==m-1){
                for(int j=0;j<n;j++){
                    if(board[i][j]=='O'){
                        helper(i,j,board,vis);
                    }
                }
            }else{
                if(board[i][0]=='O'){
                    helper(i,0,board,vis);
                }
                if(board[i][n-1]=='O'){
                    helper(i,n-1,board,vis);
                }
                
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

    }

    void helper(int i,int j,char[][] board,boolean[][] vis){
        vis[i][j]=true;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        for(int n=0;n<4;n++){
            int nrow=i+row[n];
            int ncol=j+col[n];
            if(nrow>=0 && nrow<board.length && ncol>0 && ncol<board[0].length && !vis[nrow][ncol] && board[nrow][ncol]!='X'){
                helper(nrow,ncol,board,vis);
            }

        }
    }
}
