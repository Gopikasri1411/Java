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
