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
    
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int sum=0;
        for(int i:ans)
        {
            if(i>=low && i<=high)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public void inorder(TreeNode root,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    
}