class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        List<Integer> l1=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
              l1.add(entry.getKey());
            }
        }
        int[] arr=new int[l1.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=l1.get(i);
        }
        return arr;
    }
}