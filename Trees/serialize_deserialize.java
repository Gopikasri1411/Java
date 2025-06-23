public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        helper(root,sb);
        return sb.toString();
    }
    void helper(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append("n,");
            return;
        }
        sb.append(String.valueOf(node.val));
        sb.append(",");
        helper(node.left,sb);
        helper(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       List<String> code = new ArrayList<>(Arrays.asList(data.split(",")));
       code.remove(code.size()-1);
       Collections.reverse(code);
        TreeNode node=helper2(code);
        return node;
    }
    
    TreeNode helper2(List<String> code){
        if (code.isEmpty()) return null;
        String val=code.remove(code.size()-1);
        if(val.equals("n")){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=helper2(code);
        node.right=helper2(code);
        return node;
    }
