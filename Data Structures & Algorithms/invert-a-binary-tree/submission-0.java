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
    public static TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        } else if(root.left == null && root.right == null){
            return root;
        }
        else{
          
            TreeNode r = invertTree(root.right);
            TreeNode l = invertTree(root.left);

            root.left = r;
            root.right = l;

            return root;
        }

        
    }
}
