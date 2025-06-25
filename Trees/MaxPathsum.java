int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       helper(root);
       return max; 
    }
    int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int m=left+right+root.val;
        if(max<m){
            max=m;
        }
        return Math.max(left,right)+root.val;
    }
}
