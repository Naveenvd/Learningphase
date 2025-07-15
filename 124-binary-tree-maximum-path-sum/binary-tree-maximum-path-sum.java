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
    
    public int maxPathSum(TreeNode root) 
    {
        
        int[] res={Integer.MIN_VALUE};
        maxpath(root,res);
        return res[0];
        
    }
    public int maxpath(TreeNode root,int[] res)
    {
        if(root==null)
        {
            return 0;
        }
        int ls=Math.max(0,maxpath(root.left,res));
        int rs=Math.max(0,maxpath(root.right,res));
        res[0]=Math.max(res[0],(ls+rs+root.val));
        return Math.max(ls,rs)+root.val;
    }
}