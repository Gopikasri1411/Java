public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        TreeNode root=constructBT(nums,0,nums.length);
        return root;
    }
    TreeNode constructBT(int[] nums,int st,int end){
        if(st==end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=constructBT(nums,st,mid);
        node.right=constructBT(nums,mid+1,end);
        return node;
    }
