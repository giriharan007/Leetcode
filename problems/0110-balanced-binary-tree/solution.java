/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return subTree(root) != -1;
    }

    int height(TreeNode root){
      if(root==null) return -1;
      return 1+Math.max((height(root.left)),height(root.right));
    }
    int subTree(TreeNode root){
    if (root == null) return 0;

        int leftHeight = subTree(root.left);
        if (leftHeight == -1) return -1; 

        int rightHeight = subTree(root.right);
        if (rightHeight == -1) return -1; 

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;

    }

}
