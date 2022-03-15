package 树;

public class Solution543 {
    int result =0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return result;
    }
    int depth(TreeNode root){//以root为根节点的二叉树最大深度
        if(root == null){
            return -1;//根据return 返回值可知，当root为空节点时，最大深度应该为0。即：Math.max(-1,-1)+1=0。
        }
        int leftMax = depth(root.left);
        int rightMax = depth(root.right);
        result = Math.max(result,leftMax+rightMax+2);
        return Math.max(leftMax,rightMax)+1;  
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

