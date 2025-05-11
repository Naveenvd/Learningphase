class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int actual=0;
        int n=grid.length;
        for(int i=0;i<=n*n;i++)
        {
            actual+=i;
        }
        Set<Integer> set=new HashSet<>();
        int sum=0;
        int rep=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
               set.add(grid[i][j]);
               map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                rep=entry.getKey();
            }
        }
        for(int i:set)
        {
            sum+=i;
        }
        int miss=actual-sum;

        return new int[]{rep,miss};   
    }
}