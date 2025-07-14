public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        index=postorder.length-1;
        return helper(postorder,inorder,0,inorder.length-1,map);
    }
    int index=0;
    public TreeNode helper(int[] postorder,int[] inorder,int l,int r,HashMap<Integer,Integer> map){
        if(l>r){
            return null;
        }
        int current=map.get(postorder[index]);
        index--;
        TreeNode node=new TreeNode(inorder[current]);
        if(l==r){
            return node;
        }
        node.right=helper(postorder,inorder,current+1,r,map);
        node.left=helper(postorder,inorder,l,current-1,map);
        return node;
    }
