public int kthSmallest(TreeNode root, int k) {
        getval(root);
        return list.get(k-1);
    }
    ArrayList<Integer> list=new ArrayList<>();
    void getval(TreeNode node){
        if(node==null){
            return;
        }
        getval(node.left);
        list.add(node.val);
        getval(node.right);
    } 

TreeNode helper(TreeNode root,int k){
        if(root==null){
            return null;
        }
        TreeNode left=helper(root.left,k);
        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.right,k);
    }
