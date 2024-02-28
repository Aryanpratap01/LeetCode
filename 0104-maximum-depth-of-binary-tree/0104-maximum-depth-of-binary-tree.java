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
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        int dp1 = maxDepth(root.left);
        int dp2 = maxDepth(root.right);
        
        if(dp1<dp2){
            return dp2+1;
        }
        
        else return dp1+1;
        
    }
}