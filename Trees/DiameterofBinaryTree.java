class Solution {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        int dia=left+right+1;
        diameter=Math.max(dia,diameter);
        return Math.max(left,right)+1;
    }
}
