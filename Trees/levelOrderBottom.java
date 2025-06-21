public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            list.add(level); //instead we can also specify where we need to add the list. example list.add(0,level); this will add everylist in the final one at the beginning.
            //by doing this you dont need to call collections.reverse() function.
        }
        Collections.reverse(list); 
        return list;
    }
