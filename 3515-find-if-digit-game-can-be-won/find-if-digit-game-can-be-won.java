class Solution {
    public boolean canAliceWin(int[] nums) 
    {
        int single_sum=0,double_sum=0;
        for(int i:nums )
        {
            if(i<=9)
            {
                single_sum+=i;
            }
            else
            {
                double_sum+=i;
            }
        }
        return single_sum!=double_sum;
    }
}