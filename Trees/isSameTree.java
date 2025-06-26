public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){           
            return !(p==null ^ q==null); // instead of this line ,you can also do the below method for a base condition.
        }
        // if(p==null && q==null){
        //     return true;
        // }
        // if(p==null || q==null){
        //     return false;
        // }
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
