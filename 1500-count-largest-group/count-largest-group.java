class Solution {
    public int countLargestGroup(int n) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            int temp=i;
            while(temp>0)
            {
                sum+=temp%10;
                temp/=10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            

        }
             int max=0;
            for(int k:map.keySet())
            {
                if(map.get(k)>max)
                {
                    max=map.get(k);
                }
            }
            int count=0;
            for(int i:map.keySet())
            {
                if(map.get(i)==max)
                {
                    count++;
                }
            }
         return count;   
        
    }
}