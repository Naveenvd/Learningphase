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
    public ListNode middleNode(ListNode head) 
    {
       
        int cnt=0;
        int mid=mid(head);
        while(head!=null)
        {
          cnt++;
            if(cnt==mid)
            {
                break;
            }
            head=head.next;
        }
        return head;
        
        
    }
    public static int mid(ListNode head)
    {
        ListNode ptr=head;
        int count=0;
        while(ptr!=null)
        {
            count++;
            ptr=ptr.next;
        }
    int mid=(count/2)+1;
        return mid;
    }
}