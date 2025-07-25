/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) 
    {
        List<Integer> ans=new ArrayList<>();
        pre(root,ans);
        return ans;
        
    }
    public void pre(Node root,List<Integer> ans)
    {
        if(root==null)
        {
            return ;
        }
           Stack<Node> st=new Stack<>();
           st.push(root);
           while(!st.isEmpty())
           {
            Node temp=st.pop();
            ans.add(temp.val);
            for(int i=temp.children.size()-1;i>=0;i--)
            {
                    st.push(temp.children.get(i));
            }
           }
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     ans.add(root.val);
    //     int size=root.children.size();
    //     for(int i=0;i<size-1;i++)
    //     {
    //         pre(root.children.get(i),ans);
    //     }
    //     if(size>0)
    //     {
    //         pre(root.children.get(size-1),ans);
    //     }
    }
}