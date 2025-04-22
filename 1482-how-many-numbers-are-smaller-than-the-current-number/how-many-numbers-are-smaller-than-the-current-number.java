class Solution 
{
     static{
        for(int i=0; i<100; i++)
        smallerNumbersThanCurrent(new int[2]);
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=count(nums[i],nums);
        }
        return arr;
        
    }
    public static int count(int n,int[] nums)
    {
        int count=0;
        for(int i:nums)
        {
            if(i<n)
            {
                count++;
            }
        }
        return count;
    }
}