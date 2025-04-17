class Solution {
    public int majorityElement(int[] nums) 
    {
        int ele=0;
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                ele=entry.getKey();
            }
        }
        return ele;
    }
}