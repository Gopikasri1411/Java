public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int r=preorder[0];
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==r){
                index=i;
            
            }
        }
        TreeNode node=new TreeNode(r);
        node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return node;

    }

//optimized code
public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1,map);
    }
    int index=0;
    public TreeNode helper(int[] preorder,int[] inorder,int l,int r,HashMap<Integer,Integer> map){
        if(l>r){
            return null;
        }
        int current=map.get(preorder[index]);
        index++;
        TreeNode node=new TreeNode(inorder[current]);
        if(l==r){
            return node;
        }
        node.left=helper(preorder,inorder,l,current-1,map);
        node.right=helper(preorder,inorder,current+1,r,map);
        return node;
    }
