class Solution {
    public int differenceOfSums(int n, int m) 
    {
       int d_sum=0,nd_sum=0;
       for(int i=1;i<=n;i++)
       {
          if(i%m==0)
          {
            d_sum+=i;
          }
          else
          {
            nd_sum+=i;
          }
       }
       return nd_sum-d_sum;
        
    }
}