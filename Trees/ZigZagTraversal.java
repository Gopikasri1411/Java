public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Deque<TreeNode> queue=new ArrayDeque<>();
        queue.addLast(root);
        boolean flag=false;
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                if(!flag){
                        TreeNode currentnode=queue.removeFirst();
                        level.add(currentnode.val);
                        if(currentnode.left!=null){
                            queue.addLast(currentnode.left);
                        }
                        if(currentnode.right!=null){
                            queue.addLast(currentnode.right);
                        }    
                }else{
                        TreeNode currentnode=queue.removeLast();
                        level.add(currentnode.val);
                        if(currentnode.right!=null){
                            queue.addFirst(currentnode.right);
                        }
                        if(currentnode.left!=null){
                            queue.addFirst(currentnode.left);
                        }
                }
            }
            flag=!flag;
            list.add(level);
        }
        return list;
    }
