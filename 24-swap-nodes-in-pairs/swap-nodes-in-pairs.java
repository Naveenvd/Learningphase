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
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(head!=null && head.next!=null)
        {
            ListNode n1=head;
            ListNode n2=head.next;
            
            prev.next=n2;
            n1.next=n2.next;
            n2.next=n1;
            prev=n1;
            head=n1.next;
        }
      return dummy.next;
    }    
}