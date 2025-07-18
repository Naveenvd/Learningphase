class Solution {
    public int[] numberGame(int[] nums) 
    {
        int[] arr=new int[nums.length];
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i:nums)
        {
            list.add(i);
        }
        int ind=0;
        while(!list.isEmpty())
        {
            int alice=list.get(0);
            list.remove(0);
            int bob=list.get(0);
            list.remove(0);
            arr[ind]=bob;
            arr[ind+1]=alice;
            ind+=2;
        }
        return arr;
        
    }
}