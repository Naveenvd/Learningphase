class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        String[] arr=new String[score.length];
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score)
        {
            pq.add(i);
        }
        int[] temp=new int[score.length];
        int z=0;
        while(!pq.isEmpty())
        {
            temp[z++]=pq.poll();
        }
        System.out.print(pq);
        for(int i=0;i<score.length;i++)
        {
            int rank=findpos(temp,score[i]);
           if(rank==1)
           {
            arr[i]="Gold Medal";
           }
           else if(rank==2)
           {
            arr[i]="Silver Medal";
           }
           else if(rank==3)
           {
            arr[i]="Bronze Medal";
           }
           else 
           {
            arr[i]=Integer.toString(rank);
           }
        }

        return arr;
    }
    public static int findpos(int[] temp,int k)
    {
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==k)
            {
                return i+1;
            }
        }
        return 0;
    } 
}