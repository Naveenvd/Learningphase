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
class Solution 
{
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) 
    {
        maxpath(root);
        return max;
        
    }
    public int maxpath(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int ls=Math.max(0,maxpath(root.left));
        int rs=Math.max(0,maxpath(root.right));
        max=Math.max(max,(ls+rs+root.val));
        return Math.max(ls,rs)+root.val;
    }
}