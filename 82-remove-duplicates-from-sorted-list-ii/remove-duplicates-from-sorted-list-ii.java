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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode ptr=head;
        Map<Integer,Integer> map=new TreeMap<>();
        while(ptr!=null)
        {
            map.put(ptr.val,map.getOrDefault(ptr.val,0)+1);
            ptr=ptr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode h=dummy;
        // ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                // list.add(entry.getKey());
                ListNode newnode=new ListNode(entry.getKey());
                dummy.next=newnode;
                dummy=newnode;
            }
        }
        // head=arr_ll(list);
        // return head;
        return h.next;


    }
    // public static ListNode arr_ll(ArrayList<Integer> list)
    // {
    //     if(list.size()==0)
    //     {
    //         return null;
    //     }
    //     ListNode head=new ListNode(list.get(0));
    //     ListNode temp=head;
    //     for(int i=1;i<list.size();i++)
    //     {
    //         ListNode newnode=new ListNode(list.get(i));
    //         temp.next=newnode;
    //         temp=newnode;
    //     }
    //     return head;
    // }
}