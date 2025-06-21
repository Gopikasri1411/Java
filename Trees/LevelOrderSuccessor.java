public TreeNode averageOfLevels(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentnode=queue.poll();
            
            if(currentnode.left!=null){
                queue.offer(currentnode.left);
            }
            if(currentnode.right!=null){
                queue.offer(currentnode.right);
            }
           if(currentnode.val==key){
             break;
           }
        }
        return queue.peek();
    }
