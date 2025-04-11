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
     List<Integer> str1=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> result = new ArrayList<>();
        if (root != null) {
            add(root, "", result);
        }
        return result;
    }
     void add(TreeNode node, String path, List<String> result){    
       if (node == null) return;
        path += node.val; 
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";
            add(node.left, path, result);
            add(node.right, path, result);
        }
    }
} 

