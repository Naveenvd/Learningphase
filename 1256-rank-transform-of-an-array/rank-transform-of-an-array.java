class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int rank=1;
        int[] rank_arr=arr.clone();
        Arrays.sort(rank_arr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:rank_arr)
        {
            if(!map.containsKey(i))
            {
                map.put(i,rank++);
            }
        }
         
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        
    return arr;
    }
}