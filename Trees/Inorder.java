public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return list;
    }
    List<Integer> list=new ArrayList<>();
    void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        list.add(node.val);
        helper(node.right);
    }
