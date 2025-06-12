class Solution {
    public int maxArea(int[] h) 
    {
        
        int left=0,right=h.length-1;
        int max_area=0;
        while(left<right)
        {
            int area=Math.min(h[left],h[right])*(right-left);
            max_area=Math.max(area,max_area);
            if(h[left]<h[right])
            {
                left++;
            }
            else
            {
                 right--;
            }
           
        }
        return max_area;

        
        
        
    }
}