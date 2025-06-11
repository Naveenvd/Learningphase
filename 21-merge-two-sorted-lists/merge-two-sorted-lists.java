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
class Solution 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode temp=new ListNode(0);
        ListNode head=temp;
        ListNode l1=list1;
        ListNode l2=list2;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
               temp.next=l1;
               l1=l1.next;
            }
            else
            {
                temp.next=l2;
               l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1==null)
        {
            temp.next=l2;
        }
        else
        {
            temp.next=l1;
        }
        return head.next;
        
    }
}