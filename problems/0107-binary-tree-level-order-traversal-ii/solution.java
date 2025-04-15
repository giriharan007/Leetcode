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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return l;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currl = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                currl.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            l.add(currl);
        }
        Collections.reverse(l);
        return l;
    }
}
