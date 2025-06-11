/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        ListNode ptr=head;
        Stack<Integer> st=new Stack<>();
        while(ptr!=null)
        {
            st.push(ptr.val);
            ptr=ptr.next;
        }
        ptr=head;
        while(ptr!=null)
        {
            if(ptr.val!=st.peek())
            {
                return false;
            }
            st.pop();
            ptr=ptr.next;
        }
        return true;
        
    }
}