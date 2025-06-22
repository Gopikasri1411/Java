public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);
        return level(root,xx,0)==level(root,yy,0) && !(issiblings(root,xx,yy));
    }
    TreeNode findNode(TreeNode node,int x){
        if(node==null){
            return null;
        }
        if(node.val==x){
            return node;
        }
        TreeNode n=findNode(node.left,x);
        if(n!=null){
            return n;
        }
        return findNode(node.right,x);
    }
    int level(TreeNode node,TreeNode x,int level){
        if(node==null){
            return 0;
        }
        if(node.val==x.val){
            return level;
        }
        int l=level(node.left,x,level+1);
        if(l!=0){
            return l;
        }
        return level(node.right,x,level+1);
    }

    boolean issiblings(TreeNode node,TreeNode x,TreeNode y){
        if(node==null){
            return false;
        }
        return (node.left==x && node.right==y) || (node.left==y && node.right==x) || issiblings(node.left,x,y) || issiblings(node.right,x,y);
    }
