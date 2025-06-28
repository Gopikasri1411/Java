public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return list;
    }
    List<String> list=new ArrayList<>();
    void helper(TreeNode node,String str){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            str+=node.val;
            list.add(str);
            return;
        }
        helper(node.left,str+node.val+"->");
        helper(node.right,str+node.val+"->");
    }
