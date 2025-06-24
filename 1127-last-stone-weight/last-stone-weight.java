class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
        {
            pq.add(i);
        }
        while(pq.size()>1)
        {
            int val1=pq.poll();
            int val2=pq.poll();
            if(val2-val1!=0)
            {
               pq.add(val1-val2);
            }
        }
        if(pq.size()==0)
        {
            return 0;
        }
        return pq.poll();
       
        
    }
}