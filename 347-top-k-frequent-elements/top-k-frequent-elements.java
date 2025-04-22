class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);

        }
        // List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        // list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
  
        // int[] arr=new int[k];
        // for(int i=0;i<k;i++)
        // {
        //     arr[i]=list.get(i).getKey();
        // }
        // return arr;
        int[] arr=new int[k];
        for(int i=0;i<k;i++)
        {
            int max=0;
            int key=0;
            for(int n:map.keySet())
            {
                if(map.get(n)>max)
                {
                    max=map.get(n);
                    key=n;
                }
               
            }
            arr[i]=key;
            map.remove(key);
        }
        return arr;
        
    }
}