class Solution 
{
    public void moveZeroes(int[] arr) 
    {
        int l=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[l];
                arr[l]=arr[i];
                arr[i]=temp;
                l++;
            }
            
        }
    }
}