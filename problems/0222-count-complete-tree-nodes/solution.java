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
    public int countNodes(TreeNode root) {
        int c=0;
        if(root==null){
            return c;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
       
        while(!q1.isEmpty()){
              TreeNode node=q1.poll();
              c++;
              if(node.left!=null){
                q1.add(node.left);
              }

              if(node.right!=null){
                q1.add(node.right);
              }
        }
        return c;
    }
}
