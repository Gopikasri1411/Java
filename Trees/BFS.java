public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currentnode=queue.poll();
                level.add(currentnode.val);
                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }
            list.add(level);
        }
        return list;
    }
