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
    public ListNode rotateRight(ListNode head, int k) 
    {
        int count=0;

        ListNode temp=head;
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        k=k%count;
       for(int i=0;i<k;i++)
       {
        ListNode ptr=head;
        while(ptr.next.next!=null)
        {
            ptr=ptr.next;
        }
        ListNode last=ptr.next;
        
        last.next=head;
        ptr.next=null;
        head=last;
       }
       return head;
        
    }
}