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
    private int preIndex = 0;
    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return construct(preorder, postorder, 0, postorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int[] postorder, int left, int right) {
        if (left > right || preIndex >= preorder.length) {
            return null;
        }

   
        TreeNode root = new TreeNode(preorder[preIndex++]);

      
        if (left == right) {
            return root;
        }

       
        int index = left;
        while (index <= right && postorder[index] != preorder[preIndex]) {
            index++;
        }

       
        root.left = construct(preorder, postorder, left, index);
        root.right = construct(preorder, postorder, index + 1, right - 1);

        return root;
    }
}

