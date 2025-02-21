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
    private List<Integer> l1 = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
           traverse(root);
           return l1;
        }
       
         private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        l1.add(root.val);
        traverse(root.right);
    }
}
