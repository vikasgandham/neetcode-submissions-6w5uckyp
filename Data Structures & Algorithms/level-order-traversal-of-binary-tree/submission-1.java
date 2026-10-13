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


Q [3,4,5]

poll [1] [2,3]



 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<TreeNode>();
        if (root != null){
           q.add(root);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        while(!q.isEmpty()){
            List<Integer> levelItems = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0; i< size ;i++){
                TreeNode node = q.poll();
                levelItems.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            result.add(levelItems);
        }
        return result;
        
    }
}
