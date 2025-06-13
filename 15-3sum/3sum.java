class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> seen=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int k=-(nums[i]+nums[j]);
                if(seen.contains(k))
                {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(list);
                    set.add(list);
                }
                seen.add(nums[j]);
                
            }
        }
        return new ArrayList<>(set);
        
    }
}