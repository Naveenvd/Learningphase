class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {

        return subcount(nums,k)-subcount(nums,k-1);
    }

    public int subcount(int[] nums,int k)
    {
        if(k<0)
        {
            return 0;
        }
        int sum=0,l=0,r=0,count=0;
        while(r<nums.length)
        {
            sum+=nums[r]%2;

            while(sum>k)
            {
                sum-=nums[l]%2;
                l++;
            }
            if(sum<=k)
            {
                count+=(r-l)+1;

            }
            
            r++;
        }
        return count;
        
    }
}