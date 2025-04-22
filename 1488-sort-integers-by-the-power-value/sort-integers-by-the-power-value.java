class Solution {
    public int getKth(int lo, int hi, int k) 
    {
        
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=lo;i<=hi;i++)
        {
            map.put(i,cycle(i));
        }
        int ind=0;
        int[] arr=new int[map.size()];
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
                arr[ind++]=key;
                map.remove(key);
            if(ind==arr.length) break;
        }

        return arr[k-1];
        
    }
    public static int cycle(int n)
    {
        int count=0;
        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else
            {
                n=n*3+1;
            }
            count++;
        }
        return count;
    }
}