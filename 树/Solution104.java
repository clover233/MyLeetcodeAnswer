package 树;

public class Solution104 {
// Definition for a binary tree node.
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
 
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else {
            int leftH = maxDepth(root.left);
            int rightH = maxDepth(root.right);
            int height = Math.max(leftH , rightH)+1;
            return height;
        }
    }

}
