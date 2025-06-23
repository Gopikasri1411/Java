public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node==null){
            return null;
        }
        if(node==p || node==q){
            return node;
        }
        TreeNode left=lowestCommonAncestor(node.left,p,q);
        TreeNode right=lowestCommonAncestor(node.right,p,q);
        if(left!=null && right!=null){
            return node;
        }
        if(left!=null){
            return left;
        }
        return right;
    }
