public int maxDepth(TreeNode root) {
        return height(root,0);
    }
    int height(TreeNode node,int level){
        if(node==null){
            return 0;
        }
        int h=Math.max(height(node.left,level+1),height(node.right,level+1));
        return h+1;
    }
