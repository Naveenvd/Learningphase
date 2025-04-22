class Solution {
    public int[] sortByBits(int[] arr) 
    {
        Arrays.sort(arr);
        Map<Integer,Integer> map=new LinkedHashMap<>();
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:arr)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
            map.put(i,Integer.bitCount(i));
        }
        int ind=0;
        while(true)
        {
            int min=Integer.MAX_VALUE;
            int key=-1;
            for(int i:map.keySet())
            {
                if(map.get(i)<min)
                {
                    min=map.get(i);
                    key=i;
                }

            }
            for(int i=0;i<freq.get(key);i++)
            {
                arr[ind++]=key;
            }
            map.remove(key);
            if(arr.length==ind) break;
        }
        return arr;
    }
}