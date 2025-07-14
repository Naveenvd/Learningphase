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
    public int maxDepth(TreeNode root) 
    {
        return max(root);
        
    }
    public static int max(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int ls=max(root.left);
        int rs=max(root.right);
        return Math.max(ls,rs)+1;
    }
}