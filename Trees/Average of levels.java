public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            double avg=0;
            for(int i=0;i<levelsize;i++){
                TreeNode currentnode=queue.poll();
                avg+=currentnode.val;
                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }
            list.add(avg/levelsize);
        }
        return list;
    }
