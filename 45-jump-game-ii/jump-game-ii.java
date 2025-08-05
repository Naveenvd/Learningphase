class Solution {
    public int jump(int[] nums) 
    {
        int jumps=0,current_pos=0,remaining=0;
        for(int i=0;i<nums.length-1;i++)
        {
            remaining=Math.max(remaining,i+nums[i]);

            if(i==current_pos)
            {
                jumps++;
                current_pos=remaining;
                
            
            if(current_pos>=nums.length-1)
            {
                break;
            }
            }
        }
        return jumps;
        
    }
}