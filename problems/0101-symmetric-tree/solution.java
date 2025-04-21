import java.util.*;

class Solution {
    public boolean isSymmetric(TreeNode root) {
    
        if (root == null) {
            return true;
        }

   /*     Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);  
        q.add(root.right); 

        while (!q.isEmpty()) {
            TreeNode left = q.poll();
            TreeNode right = q.poll();

            
            if (left == null && right == null) {
                continue;
            }
            
           
            if (left == null || right == null || left.val != right.val) {
                return false;
            }

            
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }

        return true;*/
    return isMirror(root.left, root.right);
}

private boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return (t1.val == t2.val)
        && isMirror(t1.left, t2.right)
        && isMirror(t1.right, t2.left);
}
}

