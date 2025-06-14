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
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                list.add(entry.getKey());
              
            }
        }
        head=arr_ll(list);
        return head;


    }
    public static ListNode arr_ll(ArrayList<Integer> list)
    {
        if(list.size()==0)
        {
            return null;
        }
        ListNode head=new ListNode(list.get(0));
        ListNode temp=head;
        for(int i=1;i<list.size();i++)
        {
            ListNode newnode=new ListNode(list.get(i));
            temp.next=newnode;
            temp=newnode;
        }
        return head;
    }
}