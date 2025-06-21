public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            for(int i=0;i<levelsize;i++){
                TreeNode currentnode=queue.poll();
                if(i==levelsize-1){
                    list.add(currentnode.val);
                }
                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            
            }
        }
        return list;
    }
